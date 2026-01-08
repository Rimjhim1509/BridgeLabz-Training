package com.SwiftcartGroceryApp;

//make this class Abstract class
abstract class Product {
	protected String name ;
	protected String category;
	protected double  price;
	public Product(String name , double price,String category) {
		this.name = name ;
		this.price= price;
		this.category=category;
	}
	public  double getPrice() {
		return price;
	}
	public  String  getName() {
		return name;
	}
	public abstract double applyDiscount();
	//we did one abstract method in abstract class for maintaining polymorphism
}
