package com.dataroshi.factory.a;

public final class MeatLoverHamburger extends Hamburger {
    @Override
    void prepare() {
        System.out.println("more meat prep");
    }

    @Override
    void cook() {
        System.out.println("cook massive meatpile");
    }
}
