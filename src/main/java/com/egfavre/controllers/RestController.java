package com.egfavre.controllers;

import org.h2.tools.Server;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * Created by user on 10/4/16.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @PostConstruct
    public void init() throws SQLException, FileNotFoundException {
        Server.createWebServer().start();
    }
}

