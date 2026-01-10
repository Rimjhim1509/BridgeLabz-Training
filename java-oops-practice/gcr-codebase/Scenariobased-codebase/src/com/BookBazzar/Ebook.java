package com.BookBazzar;

public class Ebook extends Book {
	public Ebook(String title ,String author ,double price) {
		super(title,author,price,Integer.MAX_VALUE);
	}
	public double applyDiscount(int quantity) {
		return price*quantity*0.10;
	}
}
