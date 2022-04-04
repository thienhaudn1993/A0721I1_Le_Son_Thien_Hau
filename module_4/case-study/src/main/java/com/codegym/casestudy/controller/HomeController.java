package com.codegym.casestudy.controller;

import com.codegym.casestudy.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
public class HomeController {
    @Autowired
    IEmployeeRepository iEmployeeRepository;
    @GetMapping("")
    public String homePage(Model model , HttpSession session){
        if(session.getAttribute("username") == null) {
            return "authentication/login";
        }

        model.addAttribute("info",session.getAttribute("username"));
        return "index" ;
    }
}
