package com.objectmodelling.ecommerceapp;
import java.util.*;
public class Order {
	private int orderId;
	private ArrayList<Product> products ;
	public Order(int orderId) {
		this.orderId = orderId ;
		products = new ArrayList<>();
	}
	public void addProduct(Product product) {
		products.add(product);
	}
	public double calculateTotal() {
		double total = 0;
		for(Product p : products) {
			total+= p.getPrice();
		}
		return total;
	}
	public void showProducts() {
        System.out.println("Products in Order:");
        for (Product p : products) {
            System.out.println("- " + p.getName());
        } 
	}
}
