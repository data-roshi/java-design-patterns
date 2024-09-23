package com.dataroshi.factory.b.burgers;

public final class MozMeatLoverHamburger extends Hamburger {

    public MozMeatLoverHamburger() {
        super("special buns", "bbq meat sauce", "moz meat lover");
    }

    @Override
    public void cook() {
        System.out.println("Cooking on BBQ...");
    }
}
