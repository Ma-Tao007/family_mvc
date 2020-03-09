package com.example.family.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@description
@anther  Administrator
@creater 2020-03-09 14:31
*/
@Controller
@RequestMapping("/login")
public class login {

    @RequestMapping("/main")
    public String getLoginPage(){
        return "login";
    }
}
