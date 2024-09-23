package com.dataroshi.decorator.a;

public class BasicIceCream implements IceCream{

    public BasicIceCream() {
        System.out.println("creating basic icecream");
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
