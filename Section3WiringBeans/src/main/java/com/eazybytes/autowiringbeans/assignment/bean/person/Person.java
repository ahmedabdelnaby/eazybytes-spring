package com.eazybytes.autowiringbeans.assignment.bean.person;


import com.eazybytes.autowiringbeans.assignment.bean.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ahmed AbdElnaby";
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("mercedesBenzVehicle") Vehicle vehicle) {
        this.vehicle = vehicle;
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

    @Override
    public String toString() {
        return "Person name is - " + name;
    }
}