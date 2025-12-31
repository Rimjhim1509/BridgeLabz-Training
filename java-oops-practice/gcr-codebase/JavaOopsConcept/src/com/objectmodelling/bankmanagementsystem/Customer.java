package com.objectmodelling.bankmanagementsystem;

public class Customer {
	String customerName;
	double balance ;
	//Taking reference from association
	// Each Customer object can store a reference to a Bank object
	Bank bank ;
	
	Customer(String customerName){
		this.customerName = customerName;
	}
	public void viewBalance() {
		System.out.println("Customer name : " + customerName);
		System.out.println("Balance : " + balance);
		System.out.println("Bank name : " + bank.bankName);
	}

}
