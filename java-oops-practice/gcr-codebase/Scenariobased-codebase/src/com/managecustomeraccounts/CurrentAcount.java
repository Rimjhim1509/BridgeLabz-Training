package com.managecustomeraccounts;

class CurrentAccount extends Account {
	CurrentAccount(String accNo,double bal ){
		super(accNo,bal);
		
	}
	double calculateInterest() {
		return checkBalance() *2/100;
	}
}
