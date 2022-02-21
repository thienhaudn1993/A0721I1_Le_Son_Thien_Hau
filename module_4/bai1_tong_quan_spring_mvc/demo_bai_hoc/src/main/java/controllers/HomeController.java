package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getHomePage(Model model){
        String message = "hello lop A0721I1 va A0721I2";
        model.addAttribute("thongbao", message);
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String getLoginInformation(@RequestParam("username") String username,
                                      @RequestParam("password") String password,
                                      Model model){
        String result = "";
        if ("admin".equals(username) && "123456".equals(password)){
            result = "Login Success";
        }else {
            result = "Login Fail";
        }
        model.addAttribute("result", result);
        return "result";
    }
}
