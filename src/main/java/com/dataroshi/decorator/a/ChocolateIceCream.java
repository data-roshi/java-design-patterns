package com.dataroshi.decorator.a;

public class ChocolateIceCream extends IceCreamDecorator{

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("adding chocolate");
        return 1.0 + super.cost();
    }
}
