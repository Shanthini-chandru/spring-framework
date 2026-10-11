package com.practicing.spring_framework;

import com.practicing.spring_framework.game.GameRunner;
import com.practicing.spring_framework.game.PacMan;

public class App01GameBasicJava {
    public static void main(String[] args) {
        //var game = new SuperContra();
        var game = new PacMan(); // 1. object Creation
        //var game = new MarioGame();
        var gameRunner = new GameRunner(game);
        //2. object Creation + wiring of dependency
        //Game is a dependency of GameRunner Class
        // here we are injecting game into GR class
        gameRunner.run();
    }
}
