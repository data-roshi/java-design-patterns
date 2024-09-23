package com.dataroshi.factory.b;

import com.dataroshi.factory.b.burgers.Hamburger;
import com.dataroshi.factory.b.burgers.JamaicanCheeseBurger;
import com.dataroshi.factory.b.burgers.MeatLoverHamburger;
import com.dataroshi.factory.b.burgers.VeggieBurger;

public class JamHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(HamburgerType type) {
        return switch (type) {
            case CHEESE -> new JamaicanCheeseBurger();
            case VEGGIE -> new VeggieBurger();
            case MEAT_LOVER -> new MeatLoverHamburger();
        };
    }
}
