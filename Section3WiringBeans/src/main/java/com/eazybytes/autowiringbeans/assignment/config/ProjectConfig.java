package com.eazybytes.autowiringbeans.assignment.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
    Spring @Configuration annotation is part of the spring core framework.
    Spring Configuration annotation indicates that the class has @Bean definition
    methods. So Spring container can process the class and generate Spring Beans
    to be used in the application.
**/
@Configuration
@ComponentScan(basePackages = "com.eazybytes.autowiringbeans.assignment.bean")
public class ProjectConfig {
}
