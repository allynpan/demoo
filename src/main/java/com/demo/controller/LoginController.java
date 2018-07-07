package com.demo.controller;


import com.demo.model.UserDomain;
import com.demo.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginController {
@Autowired
private LoginService loginService;
    @ResponseBody
    @PostMapping("/login")
    public String login(UserDomain user) {
        return loginService.login(user);
    }

    @ResponseBody
    @PostMapping("/register")
    public String register(UserDomain user) {
        return loginService.register(user);
    }
}