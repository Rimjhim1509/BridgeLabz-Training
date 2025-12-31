package com.objectmodelling.bankmanagementsystem;

public class Account {
	public static void main(String[] args) {
		Bank sbiBank =new Bank("SBI");
		Bank hdfcBank = new Bank("HDFC");
		
		Customer c1 =new Customer("Aryan");
		Customer c2 = new Customer("Amit");
		
		sbiBank.openAccount(c1, 5000);
		hdfcBank.openAccount(c2, 100000);
		c1.viewBalance();
		c2.viewBalance();
	}

}
