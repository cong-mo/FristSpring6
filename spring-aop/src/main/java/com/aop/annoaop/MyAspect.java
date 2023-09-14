package com.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.aop.annoaop.CalculatorImpl.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void beforefunction(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("Before->"+joinPoint.getSignature().getName()+"\t"+ Arrays.toString(args));
    }

    @AfterReturning(value = "pointcut()",returning = "res")
    public void resfuinction(JoinPoint joinPoint,Object res){
        System.out.println("Before->"+joinPoint.getSignature().getName()+"\t"+ res);
    }


    @After("pointcut()")
    public void afterfunction(JoinPoint joinPoint){
        System.out.println("After->"+joinPoint.getSignature().getName());
    }
}
