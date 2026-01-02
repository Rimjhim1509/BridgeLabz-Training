package com.objectmodelling.ecommerceapp;

public class Customer {
	private String name ;
	private int customerId ;
	public Customer(int customerId , String name ) {
		this.customerId = customerId ;
		this.name =name; 
	}
	public Order placeOrder(int orderId) {
		System.out.println(name + " placed an order");
        return new Order(orderId);

	}
}
