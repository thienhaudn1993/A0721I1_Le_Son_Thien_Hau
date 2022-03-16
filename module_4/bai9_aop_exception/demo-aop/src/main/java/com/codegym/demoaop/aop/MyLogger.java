package com.codegym.demoaop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {

    @Before("execution(* com.codegym.demoaop.controller.HelloController.*(..))")
    private void writeLogServer(){
        //Ghi thông tin mỗi khi phương thức trong HelloController được gọi

    }
}
