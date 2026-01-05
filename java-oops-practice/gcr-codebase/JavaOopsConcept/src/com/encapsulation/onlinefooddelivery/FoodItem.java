package com.encapsulation.onlinefooddelivery;

 abstract class FoodItem {
	 protected String itemName;
	 private double price;
	 private int quantity;
	 FoodItem(String itemName,double price, int quantity){
		 this.itemName = itemName;
		 this.price = price;
		 this.quantity = quantity;	
	 }
	 abstract double calculateTotalPrice();
	 public void getItemDetails() {
		 System.out.println("Item: " + itemName +
	                ", Price: " + price +
	                ", Quantity: " + quantity);
	 }
	 protected 	double getPrice() {
		 return price; 
	 }
	 protected int getQuantity() {
		 return quantity;
	 }
}
