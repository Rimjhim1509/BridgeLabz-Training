package com.collections.map.bankingsystem;

import java.util.*;

public class BankingSystem {

	private HashMap<Integer, Integer> accounts = new HashMap<>();
	private Queue<Integer> withdrawalQueue = new LinkedList<>();

	public void addAccount(int accNo, int balance) {
		accounts.put(accNo, balance);
	}

	public void requestWithdrawal(int accNo) {
		withdrawalQueue.offer(accNo);
	}

	public void processWithdrawals(int amount) {
		while (!withdrawalQueue.isEmpty()) {
			int accNo = withdrawalQueue.poll();

			if (accounts.get(accNo) >= amount) {
				accounts.put(accNo, accounts.get(accNo) - amount);
				System.out.println("Withdrawal successful for Account " + accNo);
			} else {
				System.out.println("Insufficient balance for Account " + accNo);
			}
		}
	}

	public void showSortedByBalance() {
		TreeMap<Integer, List<Integer>> sorted = new TreeMap<>();

		for (int accNo : accounts.keySet()) {
			int balance = accounts.get(accNo);

			if (!sorted.containsKey(balance)) {
				sorted.put(balance, new ArrayList<>());
			}
			sorted.get(balance).add(accNo);
		}

		System.out.println("Accounts Sorted by Balance: " + sorted);
	}

	public static void main(String[] args) {

		BankingSystem bank = new BankingSystem();

		bank.addAccount(101, 5000);
		bank.addAccount(102, 12000);
		bank.addAccount(103, 5000);

		bank.requestWithdrawal(101);
		bank.requestWithdrawal(102);

		bank.processWithdrawals(3000);
		bank.showSortedByBalance();
	}
}
