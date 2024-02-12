package com.test.fisrtrestendpoint;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/amazon")
    public String welcomeUser(){
        return "Welcome to Amazon!";
    }

    @GetMapping("/amazon/help")
    public String helpUser(){
        return "Encountered a Problem, How can we help you?";
    }
}

