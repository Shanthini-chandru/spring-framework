package com.practicing.spring_framework;

import com.practicing.spring_framework.game.GameRunner;
import com.practicing.spring_framework.game.GamingConsole;
import com.practicing.spring_framework.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.practicing.spring_framework.game")
public class App03GamingSpringBeans {


    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (App03GamingSpringBeans.class)){

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }




    }
}
