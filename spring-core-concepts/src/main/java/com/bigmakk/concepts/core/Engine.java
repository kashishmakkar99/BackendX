package com.bigmakk.concepts.core;

public class Engine {
    private String companyName;

    public Engine(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Engine() {
    }

    public void start(){
        System.out.println(companyName+" Engine Starting");
        System.out.println("Engine Started");
        System.out.println("----------------------");


    }
}
