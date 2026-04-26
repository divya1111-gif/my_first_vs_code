package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class TestController {
    @GetMapping("/get")
    public String getDetails(){
        System.out.println("hi this is get mapping ");
        return "hi";
    }

}
