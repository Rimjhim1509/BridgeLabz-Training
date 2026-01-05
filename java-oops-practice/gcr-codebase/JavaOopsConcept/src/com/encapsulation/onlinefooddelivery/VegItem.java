package com.encapsulation.onlinefooddelivery;

 class VegItem extends FoodItem implements Discountable {

	    VegItem(String name, double price, int quantity) {
	        super(name, price, quantity);
	    }

	    @Override
	    double calculateTotalPrice() {
	        return getPrice() * getQuantity() - applyDiscount();
	    }

	    @Override
	    public double applyDiscount() {
	        return (getPrice() * getQuantity()) * 0.10; // 10% discount
	    }

	    @Override
	    public String getDiscountDetails() {
	        return "10% Veg Discount Applied";
	    }
	}
