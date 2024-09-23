package com.dataroshi.singleton.b;

public class Singleton {

    private static Singleton instance;

    private String name;

    private Singleton() {}

    // threadsafety, "costly"
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
