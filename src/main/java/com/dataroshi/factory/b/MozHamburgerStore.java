package com.dataroshi.factory.b;

import com.dataroshi.factory.b.burgers.CheeseBurger;
import com.dataroshi.factory.b.burgers.Hamburger;
import com.dataroshi.factory.b.burgers.MozMeatLoverHamburger;
import com.dataroshi.factory.b.burgers.VeggieBurger;

public class MozHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(HamburgerType type) {
        return switch (type) {
            case CHEESE -> new CheeseBurger();
            case VEGGIE -> new VeggieBurger();
            case MEAT_LOVER -> new MozMeatLoverHamburger();
        };
    }
}
