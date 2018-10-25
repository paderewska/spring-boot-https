package com.https.sslcertificate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tell")
public class TellTheTruth {

    @GetMapping
    public String tellTheTruth() {
        return "The Truth";
    }
}
