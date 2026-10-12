package com.practicing.spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private final GamingConsole game;
    public GameRunner(@Qualifier("marioGameQualifier") GamingConsole game) {

        this.game = game;
    }
    public void run(){
        System.out.println("Running game: "+game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
