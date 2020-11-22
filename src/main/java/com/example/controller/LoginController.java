package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller

public class LoginController {

    @RequestMapping("/user/login")

    public String Login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,
                        HttpSession session){
        if("admin".equals(username)&&"123456".equals(password)){
            session.setAttribute("user",username);
            return "redirect:/list.html";
        }
        else {
            model.addAttribute("msg","用户名或者密码错误");
            return "login";
        }

    }

}
