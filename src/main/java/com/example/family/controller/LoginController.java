package com.example.family.controller;

import com.example.family.entity.User;
import com.example.family.service.IUserSearch;
import com.example.family.service.impl.UserSearchImpl;
import com.example.family.utils.JsonWrite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

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
        return "index";
    }

    @RequestMapping("/login/main")
    @ResponseBody
    public JsonWrite getLoginPage(User user) {
        return userSearch.selectUserByUsername(user);
    }
}
