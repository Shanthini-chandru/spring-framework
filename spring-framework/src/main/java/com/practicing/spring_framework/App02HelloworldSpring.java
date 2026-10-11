package com.practicing.spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloworldSpring {
    public static void main(String[] args) {
        //1. Launch a Spring Context
        try(var context = new AnnotationConfigApplicationContext(HelloworldConfig.class)){
            //2. Config Things we want Spring to Manage
            System.out.println( context.getBean("name"));
            System.out.println( context.getBean("age"));
            System.out.println( context.getBean("person"));
            System.out.println( context.getBean("person2"));
            System.out.println( context.getBean("person3"));
            System.out.println( context.getBean("myAddress"));
            System.out.println( context.getBean(Address.class));
            System.out.println( context.getBean(Person.class));

            System.out.println("Person Qualifier : "+ context.getBean("personQualifier"));
            System.out.println("Beans in IOC: ");
            String[] beans= context.getBeanDefinitionNames();


            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }
    }
        }


