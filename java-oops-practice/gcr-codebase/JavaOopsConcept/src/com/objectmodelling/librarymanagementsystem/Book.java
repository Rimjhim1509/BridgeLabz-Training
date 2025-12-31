package com.objectmodelling.librarymanagementsystem;

public class Book {
	String title ;
	String author ;
	Book(String title , String author){
		this.title = title;
		this.author = author;
		
	}
	public void displayBook() {
		System.out.print("Title : "+ title + "Author : "+ author);
	}
	
}
