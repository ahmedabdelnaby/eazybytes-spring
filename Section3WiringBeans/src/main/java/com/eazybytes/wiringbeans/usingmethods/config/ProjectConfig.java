package com.eazybytes.wiringbeans.usingmethods.config;

import com.eazybytes.wiringbeans.usingmethods.bean.Person;
import com.eazybytes.wiringbeans.usingmethods.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
    Spring @Configuration annotation is part of the spring core framework.
    Spring Configuration annotation indicates that the class has @Bean definition
    methods. So Spring container can process the class and generate Spring Beans
    to be used in the application.
**/
@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Ahmed AbdElnaby");
        person.setVehicle(vehicle());
        return person;
    }
}
