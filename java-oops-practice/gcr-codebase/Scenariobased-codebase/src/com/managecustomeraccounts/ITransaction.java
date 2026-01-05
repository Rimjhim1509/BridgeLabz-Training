package com.managecustomeraccounts;

interface ITransaction {
	void withdraw(double amount);
	void deposit(double amount);
	double checkBalance();
}
