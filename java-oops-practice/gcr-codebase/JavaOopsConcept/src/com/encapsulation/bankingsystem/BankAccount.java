package com.encapsulation.bankingsystem;

abstract class BankAccount {

    private int accountNumber;
    private String holderName;
    protected double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public String getAccountDetails() {
        return accountNumber + " - " + holderName;
    }

    // Abstraction
    public abstract double calculateInterest();
}
