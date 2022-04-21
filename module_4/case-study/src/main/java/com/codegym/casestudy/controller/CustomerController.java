package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.Customer;
import com.codegym.casestudy.service.ICustomerService;
import com.codegym.casestudy.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.naming.Binding;
import java.util.Optional;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService;
    @Autowired
    ICustomerTypeService customerTypeService;

    @GetMapping("")
    public ModelAndView list(Pageable pageable, @ModelAttribute("searchByCustomerName") Optional<String> search) {
        if (search.isPresent()) {
            return new ModelAndView("customer/view", "customers", customerService.searchCustomerByName(search.get(), pageable));
        }
        return new ModelAndView("customer/view", "customers", customerService.findAll(pageable));
    }

    @GetMapping("/create")
    public ModelAndView createCustomer(Model model) {
        model.addAttribute("customerType", customerTypeService.findAllCustomerType());
        return new ModelAndView("customer/create", "customer", new Customer());
    }

    @PostMapping("/create")
    public String saveCustomer(@Validated @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerType", customerTypeService.findAllCustomerType());
            return "customer/create";
        }
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Create Success");
        return "redirect:/customer";
    }

    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable Long id, Model model) {
        model.addAttribute("customerType", customerTypeService.findAllCustomerType());
        Customer customer = customerService.findCustomerById(id);
        return new ModelAndView("/customer/edit", "customer", customer);
    }

    @PostMapping("/update")
    public String update(@Validated @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerType", customerTypeService.findAllCustomerType());
            return "/customer/edit";
        }
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Update Success");
        return "redirect:/customer";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable Long id, Model model) {
        model.addAttribute("customerType", customerTypeService.findAllCustomerType());
        Customer customer = customerService.findCustomerById(id);
        return new ModelAndView("/customer/delete", "customer", customer);
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        customerService.deleteCustomerById(customer.getCustomer_id());
        redirectAttributes.addFlashAttribute("message", "Delete Success");
        return "redirect:/customer";
    }
}
