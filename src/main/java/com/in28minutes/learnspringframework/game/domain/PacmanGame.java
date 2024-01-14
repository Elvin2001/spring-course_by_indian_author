package com.in28minutes.learnspringframework.game.domain;

public class PacmanGame implements GameConsole {
    @Override
    public void up() {
        System.out.println("High jump");
    }

    @Override
    public void down() {
        System.out.println("Doing squat");
    }

    @Override
    public void left() {
        System.out.println("Accelerate to the left");
    }

    @Override
    public void right() {
        System.out.println("Accelerate to the right");
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
        return "Pacman game";
    }
}
