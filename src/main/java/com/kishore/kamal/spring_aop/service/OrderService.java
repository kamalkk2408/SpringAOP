package com.kishore.kamal.spring_aop.service;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public void createOrder(){
        System.out.println("Creating order");
    }

    public void createOrder(String orderNo){
        System.out.println("Creating order: "+ orderNo);
    }
}
