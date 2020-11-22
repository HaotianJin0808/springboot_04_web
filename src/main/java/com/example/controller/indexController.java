package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class indexController {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","hello,springboot");

        model.addAttribute("users", Arrays.asList("bupt","thu"));
        return "test";
    }
}
