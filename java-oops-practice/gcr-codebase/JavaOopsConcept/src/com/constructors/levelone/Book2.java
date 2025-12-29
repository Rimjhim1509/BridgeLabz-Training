package com.constructors.levelone;
public class Book2 {
	private String title;
	private String author;
	private int price;
	private boolean isAvailable ;

	Book2(){
		title = "The Secret";
		author = "Rhonda Byrne";
		price = 210;
		isAvailable =true ;
	}
	Book2(String title,String author,int price,boolean isAvailable ){
		this.title = title;
		this.author = author;
		this.price =price;
		this.isAvailable =isAvailable;
	}
	void borrow() {
		if(isAvailable) {
			isAvailable= false ;
			System.out.print("Book is available");
		}
		else {
			System.out.print("Book is not available");
		}
        
	}
	void display() {
		System.out.println(isAvailable);
		System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
	}
	public static void main(String[] args) {
		Book2 book1 = new Book2();
		book1.display();
		book1.borrow();
		
	}

}
