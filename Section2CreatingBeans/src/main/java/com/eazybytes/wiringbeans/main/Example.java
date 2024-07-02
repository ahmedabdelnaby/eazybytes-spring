package com.eazybytes.wiringbeans.main;

import com.eazybytes.wiringbeans.bean.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        var vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
    }
}
