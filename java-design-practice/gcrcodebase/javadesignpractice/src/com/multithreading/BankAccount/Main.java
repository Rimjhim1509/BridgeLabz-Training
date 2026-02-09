package com.multithreading.BankAccount;

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Thread t1 = new Thread(new Transaction(account, "Customer-1",12000));
		Thread t2 = new Thread(new Transaction(account, "Customer-2",2000));
		Thread t3 = new Thread(new Transaction(account, "Customer-3",5000));
		Thread t4 = new Thread(new Transaction(account, "Customer-4",7800));
		Thread t5 = new Thread(new Transaction(account, "Customer-5",4000));
		System.out.println(t1.getName() + " state: " + t1.getState());
        System.out.println(t2.getName() + " state: " + t2.getState());
        System.out.println(t3.getName() + " state: " + t3.getState());
        System.out.println(t4.getName() + " state: " + t4.getState());
        System.out.println(t5.getName() + " state: " + t5.getState());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

	}
}
