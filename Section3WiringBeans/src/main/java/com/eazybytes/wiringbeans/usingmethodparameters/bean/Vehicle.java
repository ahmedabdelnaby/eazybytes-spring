package com.eazybytes.wiringbeans.usingmethodparameters.bean;


public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehicle has been created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Printing Hello from Vehicle Bean");
    }

    @Override
    public String toString() {
        return "Vehicle name is - " + name;
    }
}