package com.multithreading.BankAccount;

class Transaction implements Runnable {

    private BankAccount account;
    private String customer;
    private int amount;

    public Transaction(BankAccount account, String customer, int amount) {
        this.account = account;
        this.customer = customer;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(customer, amount);
    }
}
