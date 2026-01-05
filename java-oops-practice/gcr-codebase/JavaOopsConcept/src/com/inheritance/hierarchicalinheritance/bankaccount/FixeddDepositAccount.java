package com.inheritance.hierarchicalinheritance.bankaccount;

class FixedDepositAccount extends BankAccount {
    private int lockPeriod;

    FixedDepositAccount(String accNo, double balance, int lockPeriod) {
        super(accNo, balance);
        this.lockPeriod = lockPeriod;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
