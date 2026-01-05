package com.encapsulation.ecommerceplatform;

public class Clothing extends Product implements Taxable {
	Clothing(int id ,String name,double price){
		super(id,name,price);
	}
	public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    public String getTaxDetails() {
        return "Clothing Tax 5%";
    }
}
