package com.ewalletsystem;

abstract class Wallet implements Transferrable{
	protected double balance;	
	Wallet(double balance) {
        this.balance = balance;
    }
	public double getBalance() {
        return balance;
    }
	public void loadMoney(double amount) {
		balance+=amount;
	}

}
