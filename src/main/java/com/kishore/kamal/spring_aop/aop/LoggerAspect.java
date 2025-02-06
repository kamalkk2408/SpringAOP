package com.kishore.kamal.spring_aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
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
//        System.out.println("jp.getArgs() : " + ( (jp.getArgs().length > 0) ? jp.getArgs()[0] :  null));
//        System.out.println("jp.getKind() : " + jp.getKind());
//        System.out.println("jp.getSignature()" + jp.getSignature());
//        System.out.println("jp.getTarget(): " + jp.getTarget());
//
//        System.out.println("jp.getThis(): " + jp.getThis());
//        System.out.println("jp.getSourceLocation(): " + jp.getSourceLocation());
//        System.out.println("jp.getStaticPart(): " + jp.getStaticPart());
//        System.out.println("jp.getClass(): " + jp.getClass());
    }

    @After("execution(* **createOrder(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }

    @Pointcut("within(com.kishore.kamal.spring_aop.service..*)")
    public void validation(){
        System.out.println("Executing validation");
    }


    @Pointcut("within(com.kishore.kamal.spring_aop.service..*)")
    public void customValidation(){
        System.out.println("Executing customValidation");
    }

    @Before("validation() && customValidation()")
    public void beforeValidate(){
        System.out.println("Executing beforeValidate");
    }

    @Pointcut("within(com.kishore.kamal.spring_aop.service..*)")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retValue")
    public void afterReturning(String retValue){
        System.out.println("Executing afterReturning: " + retValue);
    }







}
