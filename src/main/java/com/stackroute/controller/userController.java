package com.stackroute.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {

    @RequestMapping(value = "/")
    public String greeting(ModelMap map) {
        map.addAttribute("greeting","Welcome ABC to stackroute");
        return "index";

    }
}