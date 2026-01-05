package com.encapsulation.librarymanagement;

public class Main {
	
	    public static void main(String[] args) {

	        LibraryItem i1 = new Book(1, "Java Basics", "James");
	        LibraryItem i2 = new Magazine(2, "Tech Today", "Editorial");
	        LibraryItem i3 = new DVD(3, "OOP Concepts", "Oracle");

	        i1.getItemDetails();
	        System.out.println("Loan Days: " + i1.getLoanDuration());

	        i2.getItemDetails();
	        System.out.println("Loan Days: " + i2.getLoanDuration());

	        i3.getItemDetails();
	        System.out.println("Loan Days: " + i3.getLoanDuration());

	        // Interface reference
	        Reservable r1 = (Reservable) i1;
	        r1.reserveItem("Ravi");

	        Reservable r2 = (Reservable) i3;
	        r2.reserveItem("Anita");
	    }
	}

