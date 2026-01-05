package com.managecustomeraccounts;

public class MyBankApp {
public static void main(String[] args) {
	Account a1 =new SavingsAccount("ALIOP345" , 100000);
	Account a2 =new CurrentAccount("BHJKP345" , 500000);
	System.out.println("Savings Interest: " + a1.calculateInterest());
    System.out.println("Current Interest: " + a2.calculateInterest());

}
}
