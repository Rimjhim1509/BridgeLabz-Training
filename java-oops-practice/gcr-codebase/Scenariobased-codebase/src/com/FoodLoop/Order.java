package com.FoodLoop;

import java.util.*;
public class Order implements IOrderable{
	private List<FoodItem> items;
	private double total;
	private String status ;
	public Order() {
		items = new ArrayList<>();
		status = "CREATED";
	}
	public Order(List<FoodItem> comboItems) {
		items = comboItems;
		status = "CREATED";
	}
	public void addItem(FoodItem item) {
		items.add(item);
	}
	public void placeOrder() {
		total = 0 ;
		for(FoodItem item : items) {
			if(item.reduceStock()) {
				total+=item.getPrice();
			}
		}
		double discount = 0;
		for(FoodItem item : items) {
			discount+=item.applyDiscount(total);
		}
		total = total - discount;
		status = "PACKED";
	}
	public void cancelOrder() {
        status = "CANCELLED";
    }

    public double getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

}
