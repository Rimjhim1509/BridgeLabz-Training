package com.FoodLoop;

public abstract class FoodItem {
	protected String name ;
    protected String category ;
    protected double price ;
    private int stock ; 
    protected FoodItem(String name, String category,double price, int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}
    public boolean reduceStock() {
    	if(stock >0) {
    		stock--;
    		return true;
    	}
    	return false;
    }
    protected abstract double applyDiscount(double total);
    public String getName() {
    	return name;
    }
    public double getPrice() {
    	return price ;
    }
}

//Story: FoodLoop is an app where users place food orders from local restaurants.
//Requirements:
//● FoodItem class: name, category, price, availability.
//● Order class: contains list of food items and total.
//● Interface IOrderable with placeOrder() and cancelOrder().
//● Use constructors to create custom combo meals.
//● Operators: total price = sum of item prices – discounts.
//● Encapsulation: keep item stock levels hidden.
//● Inheritance: VegItem, NonVegItem extend FoodItem.
//● Polymorphism: applyDiscount() varies by order total.
//
