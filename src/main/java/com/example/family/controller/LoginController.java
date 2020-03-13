package com.example.family.controller;

import com.example.family.entity.User;
import com.example.family.service.IUserSearch;
import com.example.family.utils.JsonWrite;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/*
@description
@anther  Administrator
@creater 2020-03-09 17:15
*/
@Controller
public class LoginController {
    @Resource
    private IUserSearch userSearch;
    @RequestMapping("/")
    public String index() {
        return "login/login";
    }

    @RequestMapping("/login/main")
    @ResponseBody
    public JsonWrite getLoginPage(User user) {
        return userSearch.selectUserByUsername(user);
    }

    @RequestMapping("index")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("user/reg")
    public String getUserReg(){
        return "user/reg";
    }

    @RequestMapping("user/login")
    public String getUserLogin(){
        return "user/login";
    }

    @RequestMapping("user/forget")
    public String getUserForget(){
        return "user/forget";
    }

    @RequestMapping("user/user/list")
    public String getUserUserList(){
        return "user/user/list";
    }

    @RequestMapping("user/administrators/list")
    public String getUserAdminList(){
        return "user/administrators/list";
    }

    @RequestMapping("user/administrators/role")
    public String getUserAminRole(){
        return "user/administrators/role";
    }

}
