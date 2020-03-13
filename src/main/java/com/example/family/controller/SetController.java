package com.example.family.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@description
@anther  Administrator
@creater 2020-03-13 9:22
*/
@Controller
@RequestMapping("set")
public class SetController {

    @RequestMapping("system/website")
    public String getSysWebsite(){
        return "system/website";
    }

    @RequestMapping("system/email")
    public String getSysEmail(){
        return "system/email";
    }

    @RequestMapping("user/info")
    public String getUserInfo(){
        return "user/info";
    }

    @RequestMapping("user/password")
    public String getUserPassword(){
        return "user/password";
    }
}
