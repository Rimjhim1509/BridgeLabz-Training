package com.encapsulation.ecommerceplatform;

abstract class Product {
	
	private int productId;
	private String name;
	private double price;
	Product(int productId ,String name, double price){
		this.productId=productId;
		this.name=name;
		this.price = price;
				
	}
	public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    // Abstraction
    public abstract double calculateDiscount();
}


