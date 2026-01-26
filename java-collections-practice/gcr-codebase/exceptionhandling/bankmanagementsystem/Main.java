package com.exceptionhandling.bankmanagementsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000); // initial balance
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
