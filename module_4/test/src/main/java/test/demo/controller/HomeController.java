package test.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String homePage() {
        return "index";
    }
}
