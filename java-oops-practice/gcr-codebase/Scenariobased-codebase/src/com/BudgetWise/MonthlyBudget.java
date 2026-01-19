package com.BudgetWise;

import java.util.*;
class MonthlyBudget extends Budget{
	public MonthlyBudget(double income ,double limit ,Map<String ,Double> categoryLimits) {
		super(income , limit ,categoryLimits);
		}
	public void generateReport() {
		System.out.println(" Monthly Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + totalExpense());
        System.out.println("Savings: " + calculateNetSavings());
	}
	public void detectOverspend() {
		if (totalExpense() > limit) {
            System.out.println(" Monthly budget exceeded!");
        }
	}
}
