package com.dataroshi.factory.a;

public class HamburgerStore {

    // not real factory, very basic, but ok to separate creation from other logic here
    private final SimpleHamburgerFactory factory;

    public HamburgerStore(SimpleHamburgerFactory factory) {
        this.factory = factory;
    }

    public Hamburger orderHamburger(HamburgerType type) {

        Hamburger burger = factory.createHamburger(type);

        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }
}
