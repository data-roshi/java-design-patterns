package com.dataroshi.decorator.a;

public class PecanIceCream extends IceCreamDecorator{

    public PecanIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("adding pecan nuts");
        return 1.5 + super.cost();
    }
}
