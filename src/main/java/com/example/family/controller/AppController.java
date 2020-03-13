package com.example.family.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@description
@anther  Administrator
@creater 2020-03-13 9:15
*/
@Controller
@RequestMapping("app")
public class AppController {

    @RequestMapping("content/list")
    public String getContentList(){
        return "content/list";
    }

    @RequestMapping("content/tags")
    public String getContentTags(){
        return "content/tags";
    }

    @RequestMapping("content/comment")
    public String getContentComment(){
        return "content/comment";
    }
    @RequestMapping("forum/list")
    public String getForumList(){
        return "forum/list";
    }

    @RequestMapping("forum/replys")
    public String getForumRelys(){
        return "forum/replys";
    }

    @RequestMapping("message/index")
    public String getMessageIndex(){
        return "message/index";
    }

    @RequestMapping("workorder/list")
    public String getWorkorderList(){
        return "workorder/list";
    }

}
