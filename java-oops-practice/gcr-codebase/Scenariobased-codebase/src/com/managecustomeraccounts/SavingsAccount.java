package com.managecustomeraccounts;

class SavingsAccount extends Account {
	SavingsAccount(String accNo,double bal ){
		super(accNo,bal);
		
	}
	double calculateInterest() {
		return checkBalance() *4/100;
	}
}
