package com.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount {
	CurrentAccount(int accNo ,String name,double bal){
		super(accNo,name,bal);
		
	}
	public double calculateInterest() {
		return balance*0.02;
		
	}
}
