package com.demo.controller;


import com.demo.model.UserDomain;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginController {

    @ResponseBody
    @PostMapping("/login")
    public String login(UserDomain user) {
        return user.getUsername() + user.getPassword();
    }

    @ResponseBody
    @PostMapping("/register")
    public String register(UserDomain user) {
        return user.getUsername() + user.getPassword();
    }
}