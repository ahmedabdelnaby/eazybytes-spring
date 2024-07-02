package com.eazybytes.autowiringbeans.assignment.bean.vehicle;

import org.springframework.stereotype.Component;

@Component("mercedesBenzVehicle")
public class MercedesBenz implements Vehicle {
    private String name = "S650 Maybach";

    public MercedesBenz() {
        System.out.println("MercedesBenz has been created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MercedesBenz name is - " + name;
    }
}

