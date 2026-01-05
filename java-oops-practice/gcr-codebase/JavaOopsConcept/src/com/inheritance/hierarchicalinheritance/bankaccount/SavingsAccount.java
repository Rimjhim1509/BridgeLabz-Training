package com.inheritance.hierarchicalinheritance.bankaccount;

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}
