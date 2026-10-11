package com.practicing.spring_framework;

import com.practicing.spring_framework.game.GameRunner;
import com.practicing.spring_framework.game.GamingConsole;
import com.practicing.spring_framework.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {

    @Bean
    public GamingConsole game(){
        var game = new PacMan();
        return game;
    }
    //var game = new SuperContra();
  //  var game = new PacMan(); // 1. object Creation
    //var game = new MarioGame();
    //var gameRunner = new GameRunner(game);
    //2. object Creation + wiring of dependency
    //Game is a dependency of GameRunner Class
    // here we are injecting game into GR class
         // gameRunner.run();
}
