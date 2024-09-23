package com.dataroshi.decorator.a;

public class Main {

    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("basic cost: " + basicIceCream.cost());

        IceCream chocolateIceCream = new ChocolateIceCream(basicIceCream);
        System.out.println("choco cost: " + chocolateIceCream.cost());

        // add pecan icecream to the chocolate
        IceCream pecanIceCream = new PecanIceCream(chocolateIceCream);

        System.out.println("pecan added to chocholate: " + pecanIceCream.cost());
        // a new mint icecream and a double mint
        IceCream mintIceCream = new MintIceCream(basicIceCream);
        System.out.println("mint cost: " + mintIceCream.cost());

        IceCream doubleMintIceCream = new MintIceCream(mintIceCream);
        System.out.println("add mint to the mint cost: " + doubleMintIceCream.cost());

    }
}