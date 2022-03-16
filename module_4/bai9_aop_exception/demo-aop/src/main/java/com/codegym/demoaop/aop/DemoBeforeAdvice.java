package com.codegym.demoaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class DemoBeforeAdvice {
    @After("execution(* com.codegym.demoaop.controller.HelloController.*(..))")
    public void afterCallMethod(JoinPoint joinPoint) {
        //Ghi log log vào file txt
        System.out.println("kết thúc method: " + joinPoint.getSignature().getName());
    }

    @Before("execution(* com.codegym.demoaop.controller..*.*(..))")
    public void writeLogServer(){
        System.out.println("Đang ghi log vào server");
    }

    //
//    @Before("execution(* com.codegym.demoaop.controller.HelloController.*(..))")
//    public void beforeCallMethod(JoinPoint joinPoint) {
//        //Đếm số lần login
//        System.out.println("kết thúc method: " + joinPoint.getSignature().getName());
//    }
//
//    @AfterThrowing(value = "execution(* com.codegym.demoaop.Hello.*())", throwing = "e")
//    public void AfterThrowingCallMethod(JoinPoint joinPoint, Exception e) throws Throwable {
//        String className = joinPoint.getTarget().getClass().getSimpleName();
//        String method = joinPoint.getSignature().getName();
//        String args = Arrays.toString(joinPoint.getArgs());
//        System.out.println(String.format("[Hệ Thống] co loi xay ra: %s.%s%s: %s", className, method, args, e.getMessage()));
//    }
//
//    @Pointcut()
//    public void testPointCut(){}


}
