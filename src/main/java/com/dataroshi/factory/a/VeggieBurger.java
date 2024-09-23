package com.dataroshi.factory.a;

public final class VeggieBurger extends Hamburger{

    @Override
    void prepare() {
        System.out.println("prepare veggie stuff");
    }

    @Override
    void cook() {
        System.out.println("cook veggie stuff");
    }
}
