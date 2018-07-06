package com.betaschool.beta.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWordController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
