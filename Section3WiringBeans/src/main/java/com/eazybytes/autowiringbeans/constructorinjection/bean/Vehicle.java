package com.eazybytes.autowiringbeans.constructorinjection.bean;


import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "Mercedes Benz";

    public Vehicle() {
        System.out.println("Vehicle has been created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle name is - " + name;
    }
}