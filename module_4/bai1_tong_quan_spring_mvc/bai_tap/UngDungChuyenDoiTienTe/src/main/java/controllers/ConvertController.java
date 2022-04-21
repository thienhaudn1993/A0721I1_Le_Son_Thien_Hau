package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/controller")
    public String showConvert() {
        return "list";
    }

    @PostMapping("/controller")
    public String countConvert(@RequestParam("usd") String usd, Model model) {
        float vnd = Float.parseFloat(usd) * 23000;
        model.addAttribute("vnd", vnd);
        return "list";
    }
}
