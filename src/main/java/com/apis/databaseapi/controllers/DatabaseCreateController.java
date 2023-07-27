package com.apis.databaseapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseCreateController {
    @PostMapping("/create")
    public boolean createDatabase(String databaseName) {
        // Create DB Logic
        return true;
    }

}
