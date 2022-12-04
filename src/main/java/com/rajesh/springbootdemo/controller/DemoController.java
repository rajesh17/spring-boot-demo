package com.rajesh.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/greeting/{name}/message/{msg}")
    public String getGreeting(@PathVariable("name") String name, @PathVariable("msg") String msg){
        return "Hello " + name + " " + msg;
    }
}
