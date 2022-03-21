package com.codegym.sudungjquerytaohieuung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JqueryController {
    @GetMapping("")
    public String view(){
        return "list";
    }
    @GetMapping("/animate")
    public String animation(){
        return "animate";
    }
}
