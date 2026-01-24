package com.ArtExpo;

public class Main {
	public static void main(String[] args) {
		Artist[] artists = {
	            new Artist("Ravi", "09:30:15"),
	            new Artist("Aman", "09:31:10"),
	            new Artist("Neha", "09:29:40"),
	            new Artist("Kunal", "09:30:05")
	        };

	        SortTime sortTime = new SortTime(artists);

	        System.out.println("Before Sorting:");
	        sortTime.display();

	        sortTime.sort();

	        System.out.println("\nAfter Sorting (Booth Assignment Order):");
	        sortTime.display();

	}
}
