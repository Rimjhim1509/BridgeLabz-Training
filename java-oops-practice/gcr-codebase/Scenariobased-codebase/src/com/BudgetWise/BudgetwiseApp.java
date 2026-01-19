package com.BudgetWise;

import java.time.LocalDate;
import java.util.*;

public class BudgetwiseApp {
    public static void main(String[] args) {

        Map<String, Double> limits = new HashMap<>();
        limits.put("Food", 5000.0);
        limits.put("Rent", 10000.0);

        Budget budget = new MonthlyBudget(30000, 20000, limits);

        budget.addTransaction(
            new Transaction(4000, "EXPENSE", LocalDate.now(), "Food"));
        budget.addTransaction(
            new Transaction(12000, "EXPENSE", LocalDate.now(), "Rent"));

        budget.generateReport();   // Polymorphism
        budget.detectOverspend();
    }
}
