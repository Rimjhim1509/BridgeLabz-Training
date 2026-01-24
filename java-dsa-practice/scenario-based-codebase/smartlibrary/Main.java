package com.smartlibrary;

public class Main {
	public static void main(String[] args) {
		Book[] borrowedBooks = {
	            new Book("Data Structures", "Mark Weiss"),
	            new Book("Algorithms", "CLRS"),
	            new Book("Computer Networks", "Tanenbaum"),
	            new Book("Operating Systems", "Silberschatz")
	        };

	        BookSorter sorter =
	                new BookSorter(borrowedBooks);

	        System.out.println("Before Sorting (Borrow Order):");
	        sorter.display();

	        sorter.sort();

	        System.out.println("\nAfter Sorting (Alphabetical Order):");
	        sorter.display();
	}
}
