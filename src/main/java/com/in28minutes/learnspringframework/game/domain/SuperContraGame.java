package com.in28minutes.learnspringframework.game.domain;

public class SuperContraGame implements GameConsole {
    @Override
    public void up() {
        System.out.println("Jump and shoot");
    }

    @Override
    public void down() {
        System.out.println("Get on knees and shoot");
    }

    @Override
    public void left() {
        System.out.println("Get back and shouting to friends about it");
    }

    @Override
    public void right() {
        System.out.println("Accelerate and shoot");
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
        return "SuperContra game";
    }
}
