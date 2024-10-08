package com.dataroshi.strategy.b;

public class CreditCardPayment implements Payment{

    private String name;
    private String cardNumber;

    public CreditCardPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with CreditCard");
    }
}
