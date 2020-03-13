package com.example.family.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@description
@anther  Administrator
@creater 2020-03-13 9:09
*/
@Controller
@RequestMapping("template")
public class TemplateController {

    @RequestMapping("personalpage")
    public String getTemplatePersonalpage(){
        return "template/personalpage";
    }

    @RequestMapping("addresslist")
    public String getTemplateAddressList(){
        return "template/addresslist";
    }

    @RequestMapping("goodslist")
    public String getTemplateGoodslist(){
        return "template/goodslist";
    }

    @RequestMapping("msgboard")
    public String getTemplateMsgBoard(){
        return "template/msgboard";
    }

    @RequestMapping("search")
    public String getTemplateSearch(){
        return "template/search";
    }

    @RequestMapping("tips/404")
    public String getTemplateTips404(){
        return "template/tips/404";
    }

    @RequestMapping("tips/error")
    public String getTemplateTipsError(){
        return "template/tips/error";
    }
}
