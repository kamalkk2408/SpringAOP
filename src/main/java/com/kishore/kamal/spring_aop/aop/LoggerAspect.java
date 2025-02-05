package com.kishore.kamal.spring_aop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    /**
     * return type, package, class, method name
     */
    @Before("execution(* **createOrder(..))")
    public void beforeLogger(){
        System.out.println("Before logger");
    }

    @After("execution(* **createOrder(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }
}
