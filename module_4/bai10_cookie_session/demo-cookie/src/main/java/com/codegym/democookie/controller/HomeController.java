package com.codegym.democookie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/createCookie")
    public String createCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("userName", "TrungDP");
        cookie.setMaxAge(60);
        response.addCookie(cookie);
        return "home";
    }

    @GetMapping("/getCookie")
    public String getCookie(@CookieValue(name = "userName") String userName
            , Model model
            , HttpServletResponse response) {
        Cookie cookie = new Cookie("userName", userName);
        response.addCookie( cookie);
        model.addAttribute("cookieUser", cookie.getValue());
        return "getCookie";
    }

    @GetMapping("/deleteCookie")
    public String deleteCookie(@CookieValue(name = "userName") String userName
            , Model model
            , HttpServletResponse response){
        Cookie cookie = new Cookie("userName", "TranVanThinh");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return "home";
    }

}
