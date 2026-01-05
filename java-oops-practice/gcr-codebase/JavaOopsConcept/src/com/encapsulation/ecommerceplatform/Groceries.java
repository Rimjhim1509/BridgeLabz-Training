package com.encapsulation.ecommerceplatform;

class Groceries extends Product  {
	Groceries(int id,String name,double price){
		super(id,name,price);
	}
	public 	double calculateDiscount() {
		return getPrice()*0.10;
	}
	
}
