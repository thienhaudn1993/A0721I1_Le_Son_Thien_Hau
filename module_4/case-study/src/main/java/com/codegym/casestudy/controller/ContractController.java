package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.Contract;
import com.codegym.casestudy.service.IContractService;
import com.codegym.casestudy.service.ICustomerService;
import com.codegym.casestudy.service.IEmployeeService;
import com.codegym.casestudy.service.IServiceOfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.naming.Binding;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("contract")

public class ContractController {
    @Autowired
    IContractService contractService;
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    ICustomerService customerService;
    @Autowired
    IServiceOfService serviceOfService;

    @GetMapping("")
    public ModelAndView viewContract(Pageable pageable) {
        return new ModelAndView("contract/view", "contracts", contractService.findAllContract(pageable));
    }

    @GetMapping("/create")
    public ModelAndView createContract(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        model.addAttribute("customers", customerService.findAll());
        model.addAttribute("services", serviceOfService.findAllService());
        return new ModelAndView("contract/create", "contract", new Contract());
    }

    @PostMapping("/update")
    public String create(@Validated @ModelAttribute Contract contract, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("employees", employeeService.findAll());
            model.addAttribute("customers", customerService.findAll());
            model.addAttribute("services", serviceOfService.findAllService());
            return "contract/create";
        }
        contractService.saveContract(contract);
        redirectAttributes.addFlashAttribute("message", "Create Contract Success");
        return "redirect:/contract";
    }

}
