package com.eazybytes.autowiringbeans.constructorinjection.main;

import com.eazybytes.autowiringbeans.constructorinjection.bean.Vehicle;
import com.eazybytes.autowiringbeans.constructorinjection.config.ProjectConfig;
import com.eazybytes.autowiringbeans.constructorinjection.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        var vehicle = context.getBean(Vehicle.class);

        System.out.println("Person name from Spring Context is " + person.getName());
        System.out.println("Vehicle name from Spring Context is " + vehicle.getName());
        System.out.println("Vehicle that " + person.getName() + " owns is " + person.getVehicle().getName());
    }
}
