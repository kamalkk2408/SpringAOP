package com.kishore.kamal.spring_aop;

import com.kishore.kamal.spring_aop.config.BeanConfig;
import com.kishore.kamal.spring_aop.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopApplication {

	public static void main(String[] args) {
		System.out.println("........Starting execution.........");

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		OrderService orderService = applicationContext.getBean(OrderService.class);
		orderService.createOrder();

		orderService.createOrder("orderNo1");

	}

}
