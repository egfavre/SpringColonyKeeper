package com.egfavre.controllers;

import com.egfavre.entities.Person;
import com.egfavre.repositories.*;
import com.egfavre.utils.PasswordStorage;
import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * Created by user on 10/4/16.
 */
@Controller
public class KeeperController {
    @Autowired
    AnimalRepository animals;

    @Autowired
    CageRepository cages;

    @Autowired
    LabRepository labs;

    @Autowired
    PersonRepository people;

    @Autowired
    ProtocolRepository protocols;

    @Autowired
    RoomRepository rooms;

    @Autowired
    TrainingRepository trainings;

    @Autowired
    TreatmentRepository treatments;

    @Autowired
    VetStaffRepository vetstaffs;

    //create server connection
    @PostConstruct
    public void init() throws SQLException {
        Server.createWebServer().start();
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String welcome () {
        return "welcome";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(HttpSession session, String username, String password) throws Exception {
        Person user = people.findFirstByUsername(username);
        if (user == null){
            user = new Person(username, PasswordStorage.createHash(password));
            people.save(user);
        }
        else if (!PasswordStorage.verifyPassword(password, user.getPassword())){
            throw new Exception("wrong password");
        }

        session.setAttribute("username", username);
        return "redirect:/dashboard";
    }

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public String register () { return "registration";}

    @RequestMapping(path = "/dashboard", method = RequestMethod.GET)
    public String login () { return "dashboard";}

    @RequestMapping(path = "/admin", method = RequestMethod.GET)
    public String admin () {return "admin";}


}

