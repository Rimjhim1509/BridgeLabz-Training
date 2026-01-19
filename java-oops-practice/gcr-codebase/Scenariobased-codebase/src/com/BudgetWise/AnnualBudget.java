package com.BudgetWise;

import java.util.*;
class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit,
                         Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("📆 Annual Budget Summary");
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + totalExpense());
        System.out.println("Yearly Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        if (totalExpense() > limit) {
            System.out.println("⚠ Annual budget exceeded!");
        }
    }
}
