package com.dataroshi.factory.a;

public abstract sealed class Hamburger permits CheeseBurger, VeggieBurger, MeatLoverHamburger{

    abstract void prepare();

    abstract void cook();

    void box() {
        System.out.println("boxed");
    }
}
