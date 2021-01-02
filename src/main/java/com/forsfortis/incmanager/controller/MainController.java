package com.forsfortis.incmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(final Model model) {
        model.addAttribute("appName", "appName");
        return "index";
    }
    
    @GetMapping("/user")
    public String user(){
        return "welcome user : ";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "welcome admin ";
    }

}