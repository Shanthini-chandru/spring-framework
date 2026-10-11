package com.practicing.spring_framework;

import com.practicing.spring_framework.game.GameRunner;
import com.practicing.spring_framework.game.GamingConsole;
import com.practicing.spring_framework.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfig.class)){

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }




    }
}
