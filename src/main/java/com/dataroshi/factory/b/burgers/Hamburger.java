package com.dataroshi.factory.b.burgers;

public abstract sealed class Hamburger permits CheeseBurger, VeggieBurger, MeatLoverHamburger, JamaicanCheeseBurger, MozMeatLoverHamburger  {
    private final String name;
    private final String sauce;
    private final String buns;

     protected Hamburger(String buns, String sauce, String name) {
        this.buns = buns;
        this.sauce = sauce;
        this.name = name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Adding sauce..." + sauce);
        System.out.println("Wrap in bun..." + buns);
    }

    public void cook() {
        System.out.println("Cooking...");
    }

    public void box() {
        System.out.println("Boxing...");
    }

    public String getName() {
        return name;
    }
}
