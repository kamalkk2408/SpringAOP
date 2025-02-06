package com.kishore.kamal.spring_aop.aop;

import org.aspectj.lang.JoinPoint;
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
    public void beforeLogger(JoinPoint jp){
        System.out.println("Before logger");
        System.out.println("jp.getArgs() : " + ( (jp.getArgs().length > 0) ? jp.getArgs()[0] :  null));
        System.out.println("jp.getKind() : " + jp.getKind());
        System.out.println("jp.getSignature()" + jp.getSignature());
        System.out.println("jp.getTarget(): " + jp.getTarget());

        System.out.println("jp.getThis(): " + jp.getThis());
        System.out.println("jp.getSourceLocation(): " + jp.getSourceLocation());
        System.out.println("jp.getStaticPart(): " + jp.getStaticPart());
        System.out.println("jp.getClass(): " + jp.getClass());
    }

    @After("execution(* **createOrder(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }
}
