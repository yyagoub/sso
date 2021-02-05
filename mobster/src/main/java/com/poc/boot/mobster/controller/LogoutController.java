package com.poc.boot.mobster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/logout")
public class LogoutController {

    @GetMapping
    public String getMapping(HttpServletRequest request) throws ServletException {
        request.logout();
        return "home";
    }
}
