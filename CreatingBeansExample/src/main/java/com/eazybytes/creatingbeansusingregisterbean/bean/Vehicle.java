package com.eazybytes.creatingbeansusingregisterbean.bean;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}