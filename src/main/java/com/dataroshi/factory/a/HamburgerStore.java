package com.dataroshi.factory.a;

public class HamburgerStore {

    // not real factory, very basic, but ok to separate creation from other logic here
    // static, but can also be instance with interface to we can swap factories.
    public Hamburger orderHamburger(HamburgerType type) {

        Hamburger burger = SimpleHamburgerFactory.createHamburger(type);

        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }
}
