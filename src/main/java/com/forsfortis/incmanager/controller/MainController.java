package com.forsfortis.incmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(final Model model) {
       // model.addAttribute("appName", "appName");
        return "index";
    }

    @GetMapping("/error")
    public String errorPage(final Model model) {
        model.addAttribute("appName", "appName");
        return "error";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "admin";
    }

}