package com.practicing.spring_framework.examples.d1.a1;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{}
@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA){
        System.out.println("Some Init Logic!");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do something!");
    }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {


    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (LazyInitializationLauncherApplication.class)){
            System.out.println("Initialization of context is completed");

            context.getBean(ClassB.class).doSomething();

        }

    }
}
