package com.in28minutes.learnspringframework.game.domain;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GameConsole game;

    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.printf("Running game: %s", game);
        System.out.println();
        game.doMovements();
    }
}
