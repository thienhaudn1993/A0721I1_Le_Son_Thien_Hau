package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerServiceImpl;
import com.codegym.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private ICustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/list")
    public ModelAndView getListCustomer(){
        return new ModelAndView("index", "customers", customerService.findAll());
    }

    @GetMapping("/create")
    public String getCreatePage(){
        return "create";
    }
}
