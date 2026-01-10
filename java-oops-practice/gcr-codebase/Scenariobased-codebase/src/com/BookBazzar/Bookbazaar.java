package com.BookBazzar;

public class Bookbazaar {
	public static void main(String[] args) {
		Book b1 = new PrintedBook("Java MAstery" ,"JAmes",500 ,100);
		Book b2 = new PrintedBook("Java Book" ,"Gosling ",800 ,1000);

		Order o1 = new Order(b1,2);
		o1.confirmOrder();
		Order o2 = new Order(b2,7);
		o2.confirmOrder();
		
		System.out.println("Order get "+ o1.getStatus());
		System.out.println("Total order "+o1.calculateTotal());
		System.out.println("Order get "+ o2.getStatus());
		System.out.println("Total order "+o2.calculateTotal());

	}
}
