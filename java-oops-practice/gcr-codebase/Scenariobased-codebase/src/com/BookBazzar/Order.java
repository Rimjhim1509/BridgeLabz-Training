package com.BookBazzar;

public class Order {
	private Book book;
	private int quantity;
	private String status;
	public Order(Book book,int quantity) {
		this.book =book;
		this.quantity=quantity;
		this.status = "CREATED";  	
	}
	public double calculateTotal() {
		double total =book.price*quantity;
		double discount =book.applyDiscount(quantity);
		return total -discount;
	}
	protected void confirmOrder() {
		if(book.reduceStock(quantity)) {
			status ="CONFIRMED";
		}else {
			status ="FAILED";
		}
	}
	public String getStatus() {
		return status;
	}
}