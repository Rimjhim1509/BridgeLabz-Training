package com.SmartCheckout;

public class Item {
	String name ;
	double price ;
	int stock;
	Item(String name , double price , int stock){
		this.name = name ;
		this.stock = stock;
		this.price =price ;
	}
}
//SmartCheckout – Supermarket Billing Queue (Queue + HashMap)


//Story: At a supermarket, each checkout counter maintains a Queue of customers. Each
//customer has a list of items, and a HashMap is used to fetch price and stock quickly.
//Requirements:
//● Add/remove customers from the queue.
//● Fetch item prices from map.
//● Update stock on purchase