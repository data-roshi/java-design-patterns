package com.dataroshi.singleton.d;

public class Singleton {

    private static volatile Singleton instance;

    private String name;

    private Singleton() {
    }

    // double checked locking, only uses synchronisation the first time completely through, later calls will just do null check and return value
    // less invasive than synchronizing entire method
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
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
