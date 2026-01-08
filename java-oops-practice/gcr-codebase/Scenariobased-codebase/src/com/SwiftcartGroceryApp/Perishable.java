package com.SwiftcartGroceryApp;

public class Perishable extends Product {
	public Perishable(String name , double price) {
		super(name , price ,"Perishable");
	}
	public double applyDiscount() {
		return price*0.9;
	}
}
