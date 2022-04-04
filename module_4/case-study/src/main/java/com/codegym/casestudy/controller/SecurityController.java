package com.codegym.casestudy.controller;

import com.codegym.casestudy.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class SecurityController {
    @Autowired
    IEmployeeRepository iEmployeeRepository;
    @GetMapping("/login")
    public String login(HttpSession session , Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        model.addAttribute("info",iEmployeeRepository.getEmployeeByUser(currentPrincipalName).getEmployee_name());

        session.setAttribute("username" , iEmployeeRepository.getEmployeeByUser(currentPrincipalName).getEmployee_name());
        return "index";
    }
}
