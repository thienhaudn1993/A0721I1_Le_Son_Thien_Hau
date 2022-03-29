package com.codegym.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaseStudyController {
    @GetMapping("")
    public ModelAndView list(){
        return new ModelAndView("view","customers",)
    }
}
