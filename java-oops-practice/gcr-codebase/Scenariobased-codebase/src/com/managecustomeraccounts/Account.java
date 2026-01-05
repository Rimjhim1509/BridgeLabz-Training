package com.managecustomeraccounts;

abstract class Account implements ITransaction {
	protected String accountNumber;
	private double balance;
	Account(String accountNumber){
		this.accountNumber = accountNumber;
		this.balance =0;
	}
	Account(String accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance =balance;
	}
	protected void setBalance(double balance) {
        this.balance = balance;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
    	if(amount<=balance) {
    		balance-=amount;
    	}
    }
    abstract double calculateInterest();
}
