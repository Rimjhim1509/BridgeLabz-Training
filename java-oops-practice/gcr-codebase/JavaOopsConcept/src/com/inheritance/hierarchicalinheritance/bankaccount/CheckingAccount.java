package com.inheritance.hierarchicalinheritance.bankaccount;

class CheckingAccount extends BankAccount {
    private int withdrawalLimit;

    CheckingAccount(String accNo, double balance, int limit) {
        super(accNo, balance);
        this.withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}
