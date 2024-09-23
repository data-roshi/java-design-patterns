package com.dataroshi.factory.a;

public class Main {

    public static void main(String[] args) {

        HamburgerStore store = new HamburgerStore();
        store.orderHamburger(HamburgerType.VEGGIE);
        store.orderHamburger(HamburgerType.MEAT_LOVER);
    }
}