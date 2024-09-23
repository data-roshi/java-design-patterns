package com.dataroshi.singleton.c;

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private String name;

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
