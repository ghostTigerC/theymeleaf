package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloThymeleaf {

    @RequestMapping("/he")
    public String hello(Model model){
        model.addAttribute("name","thymeleaf");
        return "hello";
    }
}
