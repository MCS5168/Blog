package com.mcs.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object loginUser = request.getSession().getAttribute("user");
        if (loginUser == null) {
            request.setAttribute("message", "权限不足");
            System.out.println("权限不足");
            request.getRequestDispatcher("/admin").forward(request,response);
            return false;
        }
        return true;
    }
}
