package com.dataroshi.strategy.b;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int calculateTotal() {
        return products.stream()
                .map(Product::getPrice)
                .reduce(0, (sum, price) -> sum + price);
    }

    public void pay(Payment paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
