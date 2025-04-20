package com.bigmakk.concepts.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bigmakk.concepts")
public class BeanContainer {

    @Bean(name="carBean")
     public String carName(){
         return "Seltos";
     }

    @Bean(name="engineBean")
    public String EngineName(){
        return "Hyundai";
    }
}
