package com.eazybytes.wiringbeans.usingmethods.bean;


public class Person {
    private String name;

    private Vehicle vehicle;

    public Person() {
        System.out.println("Person has been created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void printHello(){
        System.out.println("Printing Hello from Person Bean");
    }

    @Override
    public String toString() {
        return "Person name is - " + name;
    }
}