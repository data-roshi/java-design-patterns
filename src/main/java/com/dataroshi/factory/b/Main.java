package com.dataroshi.factory.b;

public class Main {

    public static void main(String[] args) {

        HamburgerStore mozStore = new MozHamburgerStore();
        mozStore.orderHamburger(HamburgerType.VEGGIE);
        mozStore.orderHamburger(HamburgerType.CHEESE);
        var hamburger = mozStore.orderHamburger(HamburgerType.MEAT_LOVER);
        System.out.println(hamburger.getName());

        HamburgerStore jamStore = new JamHamburgerStore();
        jamStore.orderHamburger(HamburgerType.CHEESE);
        hamburger = jamStore.orderHamburger(HamburgerType.MEAT_LOVER);
        System.out.println(hamburger.getName());
    }
}