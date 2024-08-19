package com.roshini.demoProject.myFirstApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose endpoint
    @GetMapping("/")
    public String sayHello(){
        return "hello world!";
    }

    @GetMapping("/hello")
    public String sayHello1(){
        return "hello worddddddddddddddddddld!";
    }
}
