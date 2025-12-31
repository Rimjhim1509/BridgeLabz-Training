package com.objectmodelling.librarymanagementsystem;


import java.util.ArrayList;

public class Library {
	String libraryName ;
	
	ArrayList<Book> books ;
	Library(String libraryName){
		this.libraryName = libraryName ;
		this.books = new ArrayList<>();
	}
	public void addBook(Book book) {
		books.add(book);
	}
	public void displayLibrary() {
		System.out.println("Library : "+libraryName);
		for(Book book : books) {
			book.displayBook();
		}
		System.out.println();
	}
}
