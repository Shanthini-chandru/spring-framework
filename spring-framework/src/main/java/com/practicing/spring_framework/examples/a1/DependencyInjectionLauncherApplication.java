package com.practicing.spring_framework.examples.a1;

import com.practicing.spring_framework.game.GameRunner;
import com.practicing.spring_framework.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//YourBusinessClass
//Dependency 1
//Dependency 2
//Typically we create diff files for all the classes and dependency classes

@Component
class YourBusinessClass{
    //@Autowired
    Dependency1 dependency1;

    //Field Injection
    //@Autowired
    Dependency2 dependency2;


    public Dependency2 getDependency2() {
        return dependency2;
    }

    //@Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("dependency 2 Setter");
//        this.dependency2 = dependency2;
//    }

    public Dependency1 getDependency1() {
        return dependency1;
    }

    //setter Injection
    //@Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("dependency 1 Setter");
//        this.dependency1 = dependency1;
//    }

    @Autowired //Constructor injection
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using "+ dependency1 +" and " +dependency2;
    }

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}



@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (DependencyInjectionLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));

        }

    }
}
