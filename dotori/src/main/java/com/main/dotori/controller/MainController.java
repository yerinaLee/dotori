package com.main.dotori.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String mainPage(){
        return "index";
    }

    @RequestMapping("/web/test/site/mysite")
    public String getSitePage(){
        return "site";
    }

}
