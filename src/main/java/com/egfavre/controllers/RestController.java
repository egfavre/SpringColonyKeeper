package com.egfavre.controllers;

import org.h2.tools.Server;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * Created by user on 10/4/16.
 */
@Controller
public class RestController {
    @PostConstruct
    public void init() throws SQLException, FileNotFoundException {
        Server.createWebServer().start();
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String welcome () {
        return "welcome";
    }

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public String register () { return "registration";}

    @RequestMapping(path = "/dashboard", method = RequestMethod.GET)
    public String login () { return "dashboard";}

    @RequestMapping(path = "/admin", method = RequestMethod.GET)
    public String admin () {return "admin";}


}

