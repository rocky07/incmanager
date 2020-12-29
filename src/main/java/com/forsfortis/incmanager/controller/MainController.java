package com.forsfortis.incmanager.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

    @GetMapping("/")
    public String homePage(final Model model) {
 //       model.addAttribute("appName", "appName");
   //     return "index";
   final RestTemplate tmp=new RestTemplate();
   final List<String> stList=tmp.getForObject("http://localhost:8083/init", List.class);

   return "welcome admin : "+stList.toString();

    }
    
    @GetMapping("/user")
    public String user(){
 
        return "welcome user : ";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        final RestTemplate tmp=new RestTemplate();
        final List<String> stList=tmp.getForObject("http://localhost:8083/init", List.class);
 
        return "welcome admin : "+stList.toString();
    }

}