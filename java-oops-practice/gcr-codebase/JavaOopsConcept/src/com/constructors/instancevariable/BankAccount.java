package com.constructors.instancevariable;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
		SavingsAccount pg = new SavingsAccount();
		pg.accountNumber  = "ALYT2344";
		pg.accountHolder = "Rimjhim";
		pg.setBalance(8.67);
		pg.display();
		System.out.println("Account: " + pg.getBalance());
				
	}
}

class SavingsAccount extends BankAccount {
    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
    }
}
