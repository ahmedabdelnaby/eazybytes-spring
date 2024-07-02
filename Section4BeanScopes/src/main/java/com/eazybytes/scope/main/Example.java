package com.eazybytes.scope.main;

import com.eazybytes.scope.bean.Person;
import com.eazybytes.scope.config.ProjectConfig;
import com.eazybytes.scope.bean.MercedesBenz;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // the two hashcodes will be the same as the bean scope defined as Singleton
        var firstMercedesS650 = context.getBean(MercedesBenz.class);
        var secondMercedesS650 = context.getBean(MercedesBenz.class);
        System.out.println("TEST SINGLETON SCOPE");
        System.out.println("Hashcode of the object 'firstMercedesS650' is " + firstMercedesS650.hashCode());
        System.out.println("Hashcode of the object 'secondMercedesS650' is " + secondMercedesS650.hashCode());

        // the Person bean will be instantiated only when the bean needed
        System.out.println("TEST LAZY LOADING");
        System.out.println("Before retrieving the Person bean from the Spring Context.");
        var person = context.getBean(Person.class);
        System.out.println("After retrieving the Person bean from the Spring Context.");

        // the two hashcodes will be not the same as the bean scope defined as Prototype
        var firstPerson = context.getBean(Person.class);
        var secondPerson = context.getBean(Person.class);
        System.out.println("TEST PROTOTYPE SCOPE");
        System.out.println("Hashcode of the object 'firstPerson' is " + firstPerson.hashCode());
        System.out.println("Hashcode of the object 'secondPerson' is " + secondPerson.hashCode());
    }
}
