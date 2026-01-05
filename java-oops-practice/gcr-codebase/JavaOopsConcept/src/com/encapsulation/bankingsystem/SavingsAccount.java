package com.encapsulation.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {
	SavingsAccount(int accNo ,String name,double bal){
		super(accNo,name,bal);
		
	}
	public double calculateInterest() {
		return balance*0.02;
	}
	public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }
	@Override
	public double calculateLoanEligibility() {
		// TODO Auto-generated method stub
		return 0;
	}
}
