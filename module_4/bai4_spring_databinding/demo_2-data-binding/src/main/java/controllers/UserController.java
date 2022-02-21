package controllers;

import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.IUserService;
import services.UserServiceImpl;

import java.util.List;

@Controller
public class UserController {
    IUserService userService = new UserServiceImpl();

    @GetMapping("")
    public String getUserListPage(Model model){
        List<User> userList = userService.getAllUser();
        model.addAttribute("listUser", userList);
        return "index";
    }

    @GetMapping("/create")
    public String getCreatePage(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "create";
    }

    @PostMapping("/create")
    public String saveUser(@ModelAttribute(name = "user") User userNew){
        userService.saveUser(userNew);
        return "redirect:/";
    }
}
