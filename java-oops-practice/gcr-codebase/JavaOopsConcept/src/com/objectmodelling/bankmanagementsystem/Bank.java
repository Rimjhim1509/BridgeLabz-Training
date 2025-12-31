package com.objectmodelling.bankmanagementsystem;

public class Bank {
	String bankName;
	Bank(String bankName){
		this.bankName = bankName;
	}
	public void  openAccount(Customer customer ,double initialBalance) {
		customer.balance = initialBalance;
		customer.bank = this;
		
		System.out.println("open account for  "+ customer.customerName+" in "+ bankName);
	}
}
