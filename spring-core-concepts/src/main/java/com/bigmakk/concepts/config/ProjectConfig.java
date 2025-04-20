package com.bigmakk.concepts.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {



    @Bean
    public Student setStudent(){
        return new Student();
    }
}
