package com.bigmakk.concepts.core;

public class Car {
    private String name;

    //This makes the application tightly coupled, and we are hard coding the engine for all cars
    //private Engine engine=new Engine("Ford");


    public Car() {
    }

    private Engine engine;

    public Car(String name,Engine engine){
        this.name=name;
        this.engine=engine;
    }
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

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
