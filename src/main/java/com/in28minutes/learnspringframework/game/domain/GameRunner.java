package com.in28minutes.learnspringframework.game.domain;

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
