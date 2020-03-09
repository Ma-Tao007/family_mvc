package com.example.family.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@description
@anther  Administrator
@creater 2020-03-09 17:15
*/
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "login";
    }
}
