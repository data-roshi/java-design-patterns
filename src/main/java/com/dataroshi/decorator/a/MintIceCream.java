package com.dataroshi.decorator.a;

public class MintIceCream extends IceCreamDecorator{

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("adding mint");
        return 1.2 + super.cost();
    }
}
