package com.example.family.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@description
@anther  Administrator
@creater 2020-03-09 11:55
*/
@Controller
@RequestMapping("/goOut")
public class GoOutController {

    @RequestMapping("/getList")
    public void getList(){
        System.out.println("获取goOut数据列表中");
    }
}

