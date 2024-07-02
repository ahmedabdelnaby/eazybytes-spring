package com.eazybytes.autowiringbeans.fieldinjection.config;

import com.eazybytes.autowiringbeans.fieldinjection.bean.Person;
import com.eazybytes.autowiringbeans.fieldinjection.bean.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
    Spring @Configuration annotation is part of the spring core framework.
    Spring Configuration annotation indicates that the class has @Bean definition
    methods. So Spring container can process the class and generate Spring Beans
    to be used in the application.
**/
@ComponentScan(basePackages = "com.eazybytes.autowiringbeans.fieldinjection.bean")
@Configuration
public class ProjectConfig {
}
