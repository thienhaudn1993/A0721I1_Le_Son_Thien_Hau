package com.codegym.customer_managerment.controller;

import com.codegym.customer_managerment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public ModelAndView getCustomerList() {
        return new ModelAndView("list", "customers", customerService.findAll());
    }
}
