package com.dataroshi.command.a;

public class MarioCharacterReceiver {

    private String name;

    public void moveUp() {
        System.out.println(getName() + " move up");
    }

    public void moveLeft() {
        System.out.println(getName() + " move left");
    }

    public void moveRight() {
        System.out.println(getName() + " move right");
    }

    public void moveDown() {
        System.out.println(getName() + " move down");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
