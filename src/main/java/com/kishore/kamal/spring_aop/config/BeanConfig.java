package com.kishore.kamal.spring_aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.kishore.kamal.spring_aop")
@EnableAspectJAutoProxy
public class BeanConfig {

}
