package com.MediStore;
import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    protected String name;
    protected double price;
    protected LocalDate expiryDate;
    private int quantity;

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 50); // default quantity
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    protected boolean reduceStock(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
            return true;
        }
        return false;
    }

    public int getQuantity() {
        return quantity;
    }
}
