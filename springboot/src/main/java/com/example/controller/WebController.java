package com.example.controller;

import com.example.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @PostMapping("/web/getUser")
    public User getUser() {
        User user=new User();
        user.setName("小明");
        user.setAge(12);
        user.setPassword("123456");
        return user;
    }
}
