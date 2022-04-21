package com.codegym.controllers;

import com.codegym.model.HealthDeclaration;
import com.codegym.service.HealthService;
import com.codegym.service.HealthServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HealthController {
    private HealthService healthService = new HealthServiceImpl();

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("health", new HealthDeclaration());
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute(name = "health") HealthDeclaration healthDeclaration) {
        healthService.save(healthDeclaration);
        return "save";
    }
}
