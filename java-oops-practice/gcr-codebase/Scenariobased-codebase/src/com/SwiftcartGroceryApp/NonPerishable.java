package com.SwiftcartGroceryApp;

public class NonPerishable extends Product {
	public NonPerishable(String name , double price) {
		super(name , price ,"Perishable");
	}
	public double applyDiscount() {
		return price*0.95;
	}
}
