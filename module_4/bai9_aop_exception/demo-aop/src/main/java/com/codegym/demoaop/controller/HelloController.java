package com.codegym.demoaop.controller;

//import com.codegym.demoaop.Hello;
import com.codegym.demoaop.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Autowired
    Hello hello;

    @GetMapping("")
    public String testAOP() {
        hello.method1();
        return "index";
    }



    @ExceptionHandler()
    public String getErrorPage(){
        return "error";
    }
}
