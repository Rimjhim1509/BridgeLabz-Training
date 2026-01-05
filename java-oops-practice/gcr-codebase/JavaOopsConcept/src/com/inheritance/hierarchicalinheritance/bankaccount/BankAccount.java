package com.inheritance.hierarchicalinheritance.bankaccount;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    BankAccount(String accNo, double balance) {
        this.accountNumber = accNo;
        this.balance = balance;
    }
}
