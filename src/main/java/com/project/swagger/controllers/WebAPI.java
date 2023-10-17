package com.project.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAPI {

    @GetMapping("/test")
    public String sayHello() {
        return "Hello, World!";
    }
}
