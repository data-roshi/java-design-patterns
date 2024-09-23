package com.dataroshi.singleton.a;

public class Main {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton2.setName("sharedname");

        System.out.println(singleton1.getName());
        System.out.println(singleton2.getName());
        System.out.println(singleton1 == singleton2);
    }
}