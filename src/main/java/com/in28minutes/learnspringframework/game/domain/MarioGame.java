package com.in28minutes.learnspringframework.game.domain;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameConsole  {
    @Override
    public void up() {
        System.out.println("Jump and get coin from box");
    }

    @Override
    public void down() {
        System.out.println("Jump in a hole");
    }

    @Override
    public void left() {
        System.out.println("Running from enemies");
    }

    @Override
    public void right() {
        System.out.println("Accelerate to main target in the game");
    }

    @Override
    public void doMovements() {
        up();
        down();
        left();
        right();
    }

    @Override
    public String toString() {
        return "Mario game";
    }
}
