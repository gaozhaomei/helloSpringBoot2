package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    @GetMapping("/index")
    public String index(){
        return " hello world";
    }
}
