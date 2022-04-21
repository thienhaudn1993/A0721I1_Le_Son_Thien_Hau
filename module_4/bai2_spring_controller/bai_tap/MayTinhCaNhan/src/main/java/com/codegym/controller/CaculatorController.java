package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("home")
public class CaculatorController {
    @GetMapping("")
    public String home() {
        return "home";
    }

    @PostMapping("/caculator")
    public String caculator(@RequestParam String firstNumber,
                            @RequestParam String secondNumber,
                            @RequestParam String calculator,
                            Model model) {
        if (calculator.equals("adddition")) {
            float result = Float.parseFloat(firstNumber) + Float.parseFloat(secondNumber);
            model.addAttribute("result", "Addition " + result);
            return "home";
        } else if (calculator.equals("subtraction")) {
            float result = Float.parseFloat(firstNumber) - Float.parseFloat(secondNumber);
            model.addAttribute("result", "Subtraction " + result);
            return "home";
        } else if (calculator.equals("multiplication")) {
            float result = Float.parseFloat(firstNumber) * Float.parseFloat(secondNumber);
            model.addAttribute("result", "Multiplication " + result);
            return "home";
        } else {
            if (Float.parseFloat(secondNumber) == 0) {
                model.addAttribute("result", "Not Calculation");
            } else {
                float result = Float.parseFloat(firstNumber) / Float.parseFloat(secondNumber);
                model.addAttribute("result", "Division " + result);
                return "home";
            }
            return "home";
        }
    }
}
