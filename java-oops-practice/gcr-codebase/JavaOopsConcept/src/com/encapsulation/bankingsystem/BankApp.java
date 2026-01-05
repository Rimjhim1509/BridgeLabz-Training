package com.encapsulation.bankingsystem;
import java.util.*;
public class BankApp {
	public static void main(String[] args) {
		List<BankAccount> accounts =new ArrayList<>();
		BankAccount acc1 = new SavingsAccount(101,"Ravi",4000);
		BankAccount acc2 = new CurrentAccount(103,"Sharma",78900);
		accounts.add(acc2);
		accounts.add(acc1);
		
		for(BankAccount b : accounts) {
			System.out.print(b.getAccountDetails());
			System.out.println(b.getAccountDetails());
		}
		Loanable loanAcc =(Loanable) acc1;
		loanAcc.applyForLoan(10000);
	}
}
