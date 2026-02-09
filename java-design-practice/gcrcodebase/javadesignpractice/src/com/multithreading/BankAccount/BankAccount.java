package com.multithreading.BankAccount;
import java.time.*;
public class BankAccount {
	private int balance = 10000 ;
	
	public synchronized void withdraw(String customer , int amount) {
		System.out.println("[" + customer + "] Attempting to withdraw " + amount);
		if(balance >= amount) {
			try {
				Thread.sleep(50);
			}catch(InterruptedException e ) {
				System.out.println("Transaction interrupted");
			}
			balance-=amount;
			System.out.println(
                    "Transaction successful: " + customer +
                    ", Amount: " + amount +
                    ", Balance: " + balance +
                    ", Time: " + LocalDateTime.now()
            );

		}else {
			System.out.println(
                    "Transaction is not successful: " + customer +
                    ", Amount: " + amount +
                    ", Balance: " + balance +
                    ", Time: " + LocalDateTime.now()
            );
		}
		
	}
	 
}
