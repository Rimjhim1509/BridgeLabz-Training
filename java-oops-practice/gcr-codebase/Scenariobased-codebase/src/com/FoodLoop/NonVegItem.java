package com.FoodLoop;

public class NonVegItem extends FoodItem{
	public NonVegItem(String name , double price ,int stock) {
		super(name , "Veg",price,stock);
	}
	protected double applyDiscount(double total) {
		if(total > 500) {
			return total*0.10 ;
		
		}
		return 0;
	}
}
