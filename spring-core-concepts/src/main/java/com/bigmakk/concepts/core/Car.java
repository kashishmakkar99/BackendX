package com.bigmakk.concepts.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String name;

    //This makes the application tightly coupled, and we are hard coding the engine for all cars
    //private Engine engine=new Engine("Ford");


    public Car() {
        System.out.println("Car created using default constructor");
    }

//    @Autowired (DI using field )
    private Engine engine;

    @Autowired
//    (DI using constructor but throws error as string is primitive cant inject directly)
    public Car(@Qualifier("carBean") String name, Engine engine){
        this.name=name;
        this.engine=engine;
    }

//    @Autowired
//    public Car(Engine engine){
//        this.engine=engine;
//        System.out.println("Car created using car constructor");
//    }
    public void start(){
        engine.start();
        System.out.println(name+" started");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

//    @Autowired (DI using setter)
    public void setEngine(Engine engine) {
        System.out.println("Setting engine using setter");
        this.engine = engine;
    }
}
