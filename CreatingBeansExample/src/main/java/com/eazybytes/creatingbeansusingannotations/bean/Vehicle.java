package com.eazybytes.creatingbeansusingannotations.bean;


import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class Vehicle {

    private String name;


    @PostConstruct
    public void initialize() {
        this.name = "VW Vehicle";
    }

    @PreDestroy
    public void destroy() {
        System.out.println(
                "Destroying Vehicle Bean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Printing Hello from Component Vehicle Bean");
    }
}
