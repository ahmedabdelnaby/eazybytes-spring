package com.eazybytes.wiringbeans.usingmethodparameters.config;

import com.eazybytes.wiringbeans.usingmethodparameters.bean.Person;
import com.eazybytes.wiringbeans.usingmethodparameters.bean.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Bean("mercedesVehicle")
    public Vehicle mercedesVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Mercedes Benz");
        return vehicle;
    }

    @Bean
    public Person person(@Qualifier("mercedesVehicle") Vehicle vehicle) {
        Person person = new Person();
        person.setName("Ahmed AbdElnaby");
        person.setVehicle(vehicle);
        return person;
    }

    // Spring will search for a bean that has a type of Vehicle and then inject it to person2 bean
//    @Bean
//    public Person person2(Vehicle vehicle) {
//        Person person = new Person();
//        person.setName("Ahmed AbdElnaby");
//        person.setVehicle(vehicle);
//        return person;
//    }
}
