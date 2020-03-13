package com.example.family.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@description
@anther  Administrator
@creater 2020-03-13 9:19
*/
@Controller
@RequestMapping("senior")
public class SeniorController {

    @RequestMapping("echarts/linev")
    public String getEchartsLine(){
        return "echarts/line";
    }

    @RequestMapping("echarts/bar")
    public String getEchartsBar(){
        return "echarts/bar";
    }

    @RequestMapping("echarts/map")
    public String getEchartsMap(){
        return "echarts/map";
    }
}
