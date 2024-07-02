package com.eazybytes.creatingbeansusingconfigclass.main;

import com.eazybytes.creatingbeansusingconfigclass.bean.Vehicle;
import com.eazybytes.creatingbeansusingconfigclass.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());

        /**
            - The var keyword was introduced in Java 10. Type inference is used in
            var keyword in which it detects automatically the datatype of a variable
            based on the surrounding context.
            - in this line of code we tell Spring to use ProjectConfig class to read all configs and beans.
        **/
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        /**
            - We don’t need to do any explicit casting while fetching a bean from context. Spring is smart enough
                to look for a bean of the type you requested and passed in its context (getBean()), If such a bean
                doesn’t exist,Spring will throw an exception.
            - getBean(Vehicle.class) > tells Spring context to get the bean that returns a Vehicle object.
            - We use var keyword as the Spring is smart enough to do type casting based on the object type we passed in getBean().
            - If we don't specify the bean name, it will cause NoUniqueBeanDefinitionException due to multiple beans are defined with the same type.
                to avoid this exception we can determine which bean name we need, or use @Primary annotation to tell Spring which default bean to use.
         **/
//        var vehicleBean = context.getBean(Vehicle.class); // will cause NoUniqueBeanDefinitionException due to multiple beans are defined with the same type
//        var vehicleBean = (Vehicle) context.getBean("vehicle2");
        var vehicleBean = context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicleBean.getName());


        var hello = context.getBean(String.class);
        System.out.println("String value from Spring Context is: " + hello);
        var num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: " + num);

    }
}
