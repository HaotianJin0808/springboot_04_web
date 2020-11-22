package com.example.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //成功
        Object user=request.getSession().getAttribute("user");
        if(user==null){
            request.setAttribute("msg","没有访问权限，请登录后访问");
            request.getRequestDispatcher("/login.html").forward(request,response);
            return false;
        }
        else{
            return true;
        }
    }
}
