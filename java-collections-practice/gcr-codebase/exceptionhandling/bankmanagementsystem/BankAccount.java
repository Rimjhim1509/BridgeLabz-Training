package com.exceptionhandling.bankmanagementsystem;

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method with exception handling
    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!"); // unchecked
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!"); // checked
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
