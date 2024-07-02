package com.eazybytes.creatingbeansusingannotations.main;

import com.eazybytes.creatingbeansusingannotations.bean.Vehicle;
import com.eazybytes.creatingbeansusingannotations.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from Spring Context is: " + vehicle.getName());
        vehicle.printHello();
        context.close(); // to call @PreDestroy method
    }
}
