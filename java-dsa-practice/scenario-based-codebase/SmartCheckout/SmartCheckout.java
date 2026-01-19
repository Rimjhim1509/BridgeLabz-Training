package com.SmartCheckout;

import java.util.*;
public class SmartCheckout {
	Queue<Customer> queue  =new LinkedList<>();
	
	HashMap<String ,Item> itemMap = new HashMap<>();
	
	void addItem(String name , double price , int stock) {
		itemMap.put(name ,new Item(name ,price , stock));
	}
	//add customer to queue
	void addCustomer(Customer customer) {
		queue.add(customer);
		System.out.println(customer.name+ " joined the queue.");
	}
	//process next customer
	void processCustomer() {
		if(queue.isEmpty()) {
			System.out.println("Queue is empty");
			return ;
		}
		Customer customer =queue.poll();
		
		double total = 0 ;
		
		System.out.println("Billing "+customer.name);
		
		for(String itemName : customer.items) {
			Item item = itemMap.get(itemName);
			if(item != null && item.stock >0) {
				total +=item.price ;
				item.stock -- ;
				System.out.println(itemName + "--- price Rs. "+ item.price);
			}
			System.out.println("Item is out of stock");
			
		}
		System.out.println("Total price "+total);
	}
	public static void main(String[] args) {
		SmartCheckout store = new SmartCheckout();
		store.addItem("Milk", 50, 5);
        store.addItem("Bread", 40, 3);
        store.addItem("Eggs", 10, 10);
        Customer c1 = new Customer("Riya" , Arrays.asList("Milk", "Bread"));
        Customer c2 = new Customer("Sneha" , Arrays.asList("Chocolates ", "Bread"));
        store.addCustomer(c1);
        store.addCustomer(c2);
        store.processCustomer();
        store.processCustomer();
	}


		}
