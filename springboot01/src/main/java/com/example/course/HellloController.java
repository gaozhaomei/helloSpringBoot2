package com.example.course;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloController{
    @GetMapping("/hello")
    public String hello(String name) {
        return "hello spring boot,"+name;
    }
}
