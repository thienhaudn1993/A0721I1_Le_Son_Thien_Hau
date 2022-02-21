package controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegisterController {

    @GetMapping(value = "/register/{id}")
    public ModelAndView getRegisterPage(@PathVariable int id) {
//        ModelAndView modelAndView = new ModelAndView("register");
//        String result = "return view";
//        modelAndView.addObject("aaa", result);
//        return modelAndView;
        return new ModelAndView("register", "aaa", "return view");
    }

//    @PostMapping("/register")
//    public ModelAndView registerAccount(@RequestParam String username,
//                                  @RequestParam String password) {
//        ModelAndView modelAndView = new ModelAndView("register");
//        String result = "";
//        if (username.length() >= 5 && password.length() >= 6) {
//            result = "Register success";
//        } else {
//            result = "Register fail";
//        }
//        modelAndView.addObject("result", result);
//        return modelAndView;
//    }

    @PostMapping("/register")
    public String registerAccount(@RequestParam String username,
                                  @RequestParam String password,
                                  RedirectAttributes redirectAttributes,
                                  ModelMap model) {
        String result = "";
        if (username.length() >= 5 && password.length() >= 6) {
            result = "Register success";
            redirectAttributes.addFlashAttribute("result", result);
            return "redirect:/";
        } else {
            result = "Register fail";
            model.addAttribute("result", result);
            return "register";
        }
    }
}
