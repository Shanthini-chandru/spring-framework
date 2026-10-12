package com.practicing.spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContra implements GamingConsole{
    public void up(){
        System.out.println("up");
    }

    public void down(){
        System.out.println("sit down");
    }

    public void right(){
        System.out.println("Shoot a bullet");
    }

    public void left(){
        System.out.println("Go back");
    }
}
