package com.example.movieservice.com.example.movieservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Value("${message}")
    String message;

    @RequestMapping("/message")
    public String getMessage(){
        return message;
    }
}