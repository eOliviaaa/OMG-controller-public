package com.example.omgcontroller.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default")
@CrossOrigin
public class DefaultController {
    @GetMapping("/test")
    public String test(){
        return "OMG controller is running";
    }
}
