package com.practicing.spring_framework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class HelloworldConfig {

    @Bean
    public String name(){
        return "Chan";
    }

    @Bean
    public int age(){
        return 20;
    }

    @Bean
    public Person person(){
        return new Person("viay", 26,
                new Address("Beam House","New york"));
    }

     @Bean
        public Person personQualifier(String name, int age, @Qualifier("addressQuali") Address address){
            return new Person("viay", 26,
                     address);
        }

    //make relationship with existing bean
    @Bean
    public Person person2(){
        return new Person(name(), age(), new Address("Java Island","Indonesia"));
    }

    //using existing bean by param
    @Bean
    @Primary
    public Person person3(String name, int age, Address newAddress){ //name, age, address2
        return new Person(name,age, newAddress);
    }

    @Bean(name="myAddress")
    @Primary
    Address address(){
        return new Address("car street","London");
    }

    @Bean(name="newAddress")
    @Qualifier("addressQuali")
    Address address1(){
        return new Address("Comfort street","California");
    }
}
