package com.bigmakk.concepts.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String companyName;

    @Autowired
    public Engine(@Qualifier("engineBean") String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Engine() {
        System.out.println("Engine created using default constructor");
    }

    public void start(){
        System.out.println(companyName+" Engine Starting");
        System.out.println("Engine Started");
        System.out.println("----------------------");


    }
}
