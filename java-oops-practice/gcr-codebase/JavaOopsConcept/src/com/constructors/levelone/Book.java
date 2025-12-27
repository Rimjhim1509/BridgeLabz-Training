package com.constructors.levelone;

public class Book {
	private String title;
	private String author;
	private int price;

	Book(){
		title = "The Secret";
		author = "Rhonda Byrne";
		price = 210;
	}
	Book(String title,String author,int price){
		this.title = title;
		this.author = author;
		this.price =price;
	}
	public  void displayDetails() {
		System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
        
	}
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.displayDetails();
		
	}

}
