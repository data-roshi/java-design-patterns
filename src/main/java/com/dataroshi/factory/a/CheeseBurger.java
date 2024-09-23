package com.dataroshi.factory.a;

public final class CheeseBurger extends Hamburger{

    @Override
    void prepare() {
        System.out.println("prep cheeese");
    }

    @Override
    void cook() {
        System.out.println("cook the burger");
    }
}
