package com.rajesh.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/greeting/{name}")
    public String getGreeting(@PathVariable("name") String name){
        return "Hello " + name;
    }
}
