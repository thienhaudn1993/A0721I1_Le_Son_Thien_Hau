package com.codegym.formregistrationvalidation.controller;

import com.codegym.formregistrationvalidation.model.User;
import com.codegym.formregistrationvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class FormController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public ModelAndView view(){
        return new ModelAndView("index","user", new User());
    }
    @PostMapping("/createUser")
    public ModelAndView save(@Validated @ModelAttribute User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return new ModelAndView("index");
        } else {
            userService.saveUser(user);
            return new ModelAndView("result","user1",user);
        }
    }
}
