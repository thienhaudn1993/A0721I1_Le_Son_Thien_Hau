package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.Service;
import com.codegym.casestudy.service.IRentTypeService;
import com.codegym.casestudy.service.IServiceOfService;
import com.codegym.casestudy.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("service")
public class ServiceController {
    @Autowired
    IServiceOfService serviceOfService;
    @Autowired
    IRentTypeService rentTypeService;
    @Autowired
    IServiceTypeService serviceTypeService;

    @GetMapping("")
    public ModelAndView listService() {
        return new ModelAndView("/service/view", "services", serviceOfService.findAllService());
    }

    @GetMapping("/create")
    public ModelAndView create(Model model) {
        model.addAttribute("rentType", rentTypeService.findAllRentType());
        model.addAttribute("serviceType", serviceTypeService.findAllServiceType());
        return new ModelAndView("/service/create", "service", new Service());
    }

    @PostMapping("/update")
    public String saveService(@Validated @ModelAttribute Service service, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("rentType", rentTypeService.findAllRentType());
            model.addAttribute("serviceType", serviceTypeService.findAllServiceType());
            return "/service/create";
        }
        serviceOfService.saveService(service);
        redirectAttributes.addFlashAttribute("message", "Create Service Success");
        return "redirect:/service";
    }
}
