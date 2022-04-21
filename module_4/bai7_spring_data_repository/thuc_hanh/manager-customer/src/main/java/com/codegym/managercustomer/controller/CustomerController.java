package com.codegym.managercustomer.controller;

import com.codegym.managercustomer.model.Customer;
import com.codegym.managercustomer.service.CustomerSerive;
import com.codegym.managercustomer.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("list")
public class CustomerController {
    @Autowired
    private CustomerSerive customerSerive;
    @Autowired
    private ProvinceService provinceService;

    @GetMapping("")
    public ModelAndView list() {
        return new ModelAndView("list", "customers", customerSerive.findAll());
    }

    @GetMapping("/create-customer")
    public ModelAndView create(Model model) {
        model.addAttribute("provinces", provinceService.findAll());
        return new ModelAndView("create", "customer", new Customer());
    }

    @PostMapping("/create-customer")
    public String save(Customer customer, RedirectAttributes redirect) {
        customerSerive.saveCustomer(customer);
        redirect.addFlashAttribute("message", "Create Success");
        return "redirect:/list";
    }

    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable Long id, Model model) {
        model.addAttribute("provinces", provinceService.findAll());
        return new ModelAndView("edit", "customer", customerSerive.findCustomerById(id));
    }

    @PostMapping("/edit-customer")
    public String update(Customer customer, RedirectAttributes redirect) {
        customerSerive.saveCustomer(customer);
        redirect.addFlashAttribute("message", "Update Success");
        return "redirect:/list";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable Long id) {
        return new ModelAndView("delete", "customer", customerSerive.findCustomerById(id));
    }

    @PostMapping("/delete-customer")
    public String remove(Customer customer, RedirectAttributes redirect) {
        customerSerive.deleteCustomer(customer.getId());
        redirect.addFlashAttribute("message", "Delete Success");
        return "redirect:/list";
    }

}
