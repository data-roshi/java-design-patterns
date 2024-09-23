package com.dataroshi.factory.a;

public abstract class SimpleHamburgerFactory {

    public static Hamburger createHamburger(HamburgerType type) {
        return switch (type) {
            case CHEESE -> new CheeseBurger();
            case VEGGIE -> new VeggieBurger();
            case MEAT_LOVER -> new MeatLoverHamburger();
        };
    }
}
