package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.example.config.dao.communicationdao;
import com.example.config.pojo.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/user")
public class TelController {

    //@Resource(name = "userService")
    //private UserService userService;
    @Autowired
    communicationdao peopledao;
    @RequestMapping(value = "checkUser.action")
    public void checkUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String tel = request.getParameter("tel");
        Communication person =peopledao.getPersonByTel(tel);
        for(Communication value : communicationdao.people.values()){
            if(value.getTel().equals(tel)){
                out.print("Not OK");
                return ;
            }
        }
        out.print("OK");
        //User user = userService.checkUser(name);
        //out.print(person.getTel());
            //Integer a=1;
//        if ("87462376".equals(tel)) {
//            out.print("Not OK");
//            //out.print(person.getTel());
//        } else {
//            out.print("OK");//
//        }
    }

}
