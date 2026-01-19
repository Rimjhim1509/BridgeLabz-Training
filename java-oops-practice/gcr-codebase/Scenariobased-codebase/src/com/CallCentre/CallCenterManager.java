package com.CallCentre;

import java.util.*;

class Customer{
	String name ;
	String id ;
	boolean isVIP ;
	Customer(String name , String id , boolean isVIP){
		this.name = name ;
		this.id = id ;
		this.isVIP =isVIP ;
	}
}
public class CallCenterManager {
	static Queue<Customer> commonQueue = new LinkedList<>();
	static PriorityQueue<Customer> specialQueue = new  PriorityQueue<>((a,b) -> a.id.compareTo(b.id));
	//map me string is for name and integer is used to count the no. of call whenever customer call integer count ++;
	static HashMap<String , Integer>callCountMap = new HashMap<>();
	
	static void receiveCall(Customer customer) {
		callCountMap.put(customer.id ,callCountMap.getOrDefault(customer.id , 0)+1 );
		if(customer.isVIP) {
			specialQueue.offer(customer);
			System.out.println("VIP Call Received: " + customer.name);
		}
		else {
			commonQueue.offer(customer);
			System.out.println("Normal Call Received: " + customer.name);
		}

	}
	static void handleCall() {
		Customer customer ;
		if(!specialQueue.isEmpty()) {
			customer = specialQueue.poll();
			System.out.println("Handling call of " + customer.name);
		}else if(!commonQueue.isEmpty()){
			customer = commonQueue.poll();
			System.out.println("Handling call of " + customer.name);
		}else {
			System.out.println("No  Calls in : ");

		}
	}
	public static void main(String[] args) {
		receiveCall(new Customer("Raju", "210" , false));
		receiveCall(new Customer("shivani", "120" , true));
		receiveCall(new Customer("shreya", "216" , false));
		receiveCall(new Customer("virat", "104" , true));
		receiveCall(new Customer("Raju", "210" , false));
		receiveCall(new Customer("Raju", "210" , false));
		handleCall();
        handleCall();
        handleCall();
        handleCall();
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println("Customer ID: " + entry.getKey()
                    + ", Calls: " + entry.getValue());
        }

	}
}
