package com.eazybytes.autowiringbeans.assignment.main;

import com.eazybytes.autowiringbeans.assignment.bean.vehicle.Vehicle;
import com.eazybytes.autowiringbeans.assignment.config.ProjectConfig;
import com.eazybytes.autowiringbeans.assignment.bean.person.Person;
import com.eazybytes.autowiringbeans.assignment.bean.vehicle.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var persons = context.getBeanNamesForType(Person.class); // display all beans names defined from Person type
        var person = context.getBean(Person.class);
        var vehicles = context.getBeanNamesForType(Vehicle.class); // display all beans names defined from Vehicle type
        var vehicle = context.getBean(Vehicle.class);
        var vehicleService = context.getBean(VehicleService.class);

        System.out.println(person.getName() + " owns " + person.getVehicle());
        vehicleService.playQuraan();
        vehicleService.moveVehicle();
    }
}
