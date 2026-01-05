package com.encapsulation.onlinefooddelivery;

class NonVegItem extends FoodItem {

    private double extraCharge = 50;

    NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + extraCharge;
    }
}
