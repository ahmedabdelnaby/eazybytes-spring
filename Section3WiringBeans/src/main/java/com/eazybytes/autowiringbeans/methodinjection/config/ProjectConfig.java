package com.eazybytes.autowiringbeans.methodinjection.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
    Spring @Configuration annotation is part of the spring core framework.
    Spring Configuration annotation indicates that the class has @Bean definition
    methods. So Spring container can process the class and generate Spring Beans
    to be used in the application.
**/
@ComponentScan(basePackages = "com.eazybytes.autowiringbeans.methodinjection.bean")
@Configuration
public class ProjectConfig {
}
