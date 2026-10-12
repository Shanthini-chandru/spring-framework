package com.practicing.spring_framework.examples.B.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class SpringLauncherApplication {


    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (SpringLauncherApplication.class)){
            System.out.println("Max of Bean: "+context.getBean(BusinessCalculationServiceApplication.class).findMax());



        }




    }
}
