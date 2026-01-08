package com.SwiftcartGroceryApp;

import java.util.ArrayList;
import java.util.List;

public class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    public Cart() {
        products = new ArrayList<>();
    }

    public Cart(List<Product> preselected) {
        products = preselected;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    @Override
    public void applyDiscount() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.applyDiscount(); // polymorphism
        }
    }

    @Override
    public double generateBill() {
        applyDiscount();
        return totalPrice;
    }

    public void showCart() {
        System.out.println("Cart Items:");
        for (Product p : products) {
            System.out.println(" - " + p.getName() + ": ₹" + p.getPrice());
        }
        System.out.println("Total after discount: ₹" + generateBill());
    }
}
