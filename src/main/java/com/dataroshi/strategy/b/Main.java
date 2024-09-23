package com.dataroshi.strategy.b;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("978", 15);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        cart.pay(new PaypalPayment("email", "pass"));

        cart.pay(new CreditCardPayment("blah", "12346"));
    }
}