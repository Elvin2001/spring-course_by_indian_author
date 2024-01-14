package com.in28minutes.learnspringframework.game.configuration;

import com.in28minutes.learnspringframework.game.domain.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfiguration {
    @Bean
    public GameConsole marioGame() {
        return new MarioGame();
    }

    @Bean
    @Primary
    public GameConsole superContraGame() {
        return new SuperContraGame();
    }

    @Bean
    public GameConsole pacmanGame() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GameConsole game) {
        return new GameRunner(game);
    }
}
