package com.dataroshi.factory.b;

import com.dataroshi.factory.b.burgers.Hamburger;

public abstract class HamburgerStore {

    public Hamburger orderHamburger(HamburgerType type) {

        var burger = createHamburger(type);

        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }

   abstract public Hamburger createHamburger(HamburgerType type);
}
