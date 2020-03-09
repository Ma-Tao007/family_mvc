package com.example.family.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@description
@anther  mt
@creater 2020-03-09 11:54
*/
@Controller
@RequestMapping("/goIn")
public class GoInController {
    @RequestMapping("/getList")
    public void getList(){
        System.out.println("进入goin获取列表");
    }

    @ResponseBody
    @RequestMapping("/get")
    public String getMsg(){
        return "123";
    }

    @RequestMapping("/getPage")
    public String getPage(HttpServletRequest request, HttpServletResponse response,String username,String password){
        System.out.println("username："+username+"...password"+password);
        request.setAttribute("msg","实现request中封装数据返回");
        return "index";
    }

}
