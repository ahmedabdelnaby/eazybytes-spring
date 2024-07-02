package com.eazybytes.scope.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mercedesBenzVehicle")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MercedesBenz {
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

