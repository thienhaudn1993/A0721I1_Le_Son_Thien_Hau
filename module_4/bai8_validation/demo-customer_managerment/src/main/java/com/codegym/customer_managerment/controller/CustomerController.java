package com.codegym.customer_managerment.controller;

import com.codegym.customer_managerment.model.Customer;
import com.codegym.customer_managerment.model.Province;
import com.codegym.customer_managerment.service.CustomerService;
import com.codegym.customer_managerment.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    ProvinceService provinceService;

    @GetMapping("")
    public ModelAndView getCustomerList(@PageableDefault(size = 5) Pageable pageable) {
        return new ModelAndView("list", "customers", customerService.findAll(pageable));
    }

    @GetMapping("/create")
    public ModelAndView getCreatePage(Model model){
        List<Province> provinces = provinceService.findAll();
        model.addAttribute("provinces", provinces);
        return new ModelAndView("create", "customer", new Customer());
    }

    @PostMapping("/create")
    public String saveCustomer(@Validated @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasFieldErrors()){
            List<Province> provinces = provinceService.findAll();
            model.addAttribute("provinces", provinces);
            return "create";
        }else {
            customerService.saveCustomer(customer);
            redirectAttributes.addFlashAttribute("message", "Create success");
            return "redirect:/";
        }
    }
}
