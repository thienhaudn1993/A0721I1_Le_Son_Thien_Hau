package com.codegym.controller.controller;

import com.codegym.controller.model.MailBox;
import com.codegym.controller.service.IMailBoxService;
import com.codegym.controller.service.MailBoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class MailBoxController {
        IMailBoxService iMailBoxService = new MailBoxService();
    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("box", new MailBox());
        return "home";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute(name = "box") MailBox mailBox) {
        iMailBoxService.save(mailBox);
        return "save";
    }
}
