package com.BudgetWise;

import java.util.*;
abstract class Budget implements IAnalyzable {
	protected double income;
	protected double limit ;
	protected Map<String ,Double> categoryLimits ;
	protected List<Transaction> transactions ;
	protected Budget(double income ,double income1, Map<String ,Double> categoryDetails) {
		this.income =income1 ;
		this.limit = limit ;
		this.categoryLimits = categoryLimits ;
		this.transactions = transactions ;
	}
	public void addTransaction(Transaction t) {
		transactions.add(t);
	}
	protected double totalExpense() {
		double sum = 0;
		for(Transaction t : transactions) {
		if(t.getType().equals("Expense")) {
			sum += t.getAmount();
		}	
	}
		return sum;
	}
	public double calculateNetSavings() {
        return income - totalExpense();
    }

}
//Constructors for monthly budgets with custom categories