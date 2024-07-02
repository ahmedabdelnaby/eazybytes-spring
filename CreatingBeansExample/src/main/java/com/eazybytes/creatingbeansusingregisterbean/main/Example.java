package com.eazybytes.creatingbeansusingregisterbean.main;

import com.eazybytes.creatingbeansusingregisterbean.bean.Vehicle;
import com.eazybytes.creatingbeansusingregisterbean.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vw = new Vehicle();
        vw.setName("Volkswagen");
        Supplier<Vehicle> vwSupplier = () -> vw;

        Supplier<Vehicle> audiSupplier = () -> {
            var audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        var random = new Random();
        var randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);

        if (randomNumber % 2 == 0) {
            context.registerBean("vw", Vehicle.class, vwSupplier);
        } else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle vwVehicle = null;
        Vehicle audiVehicle = null;

        try {
            vwVehicle = context.getBean("vw", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating vw vehicle");
        }

        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating audi vehicle");
        }

        if (vwVehicle != null) {
            System.out.println("Programming Vehicle name from Spring Context is: " + vwVehicle.getName());
        } else {
            System.out.println("Programming Vehicle name from Spring Context is: " + audiVehicle.getName());
        }

    }
}
