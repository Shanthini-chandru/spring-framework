package com.practicing.spring_framework.examples.h1.a1;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XMLConfigContextLauncherApplication {


    public static void main(String[] args) {

        try (var context =
                     new ClassPathXmlApplicationContext
                             ("contextConfiguration.xml")){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("game"));
            System.out.println(context.getBean("gameRunner"));


        }




    }
}
