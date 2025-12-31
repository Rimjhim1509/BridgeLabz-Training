package com.objectmodelling.librarymanagementsystem;

public class AggregationDemo {
	public static void main(String[] args) {
		Book b1 = new Book("The Secret","Rhonda Byrne");
		Book b2 = new Book("The Wings of Fire","A.P.J. Abdul Kalam");
		Book b3 = new Book("The Secret","Rhonda Byrne");
		
		Library centralLibrary = new Library("Central Library");
		Library cityLibrary = new Library("New Library");
		
		centralLibrary.addBook(b3);
		centralLibrary.addBook(b2);
		
		cityLibrary.addBook(b3);
		cityLibrary.addBook(b1);
		centralLibrary.displayLibrary();
		cityLibrary.displayLibrary();
	}

}
