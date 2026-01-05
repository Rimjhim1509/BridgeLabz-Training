package com.ewalletsystem;

public class Transaction {
	private String fromUser;
	private String toUser;
	private double amount;
	Transaction( String fromUser, String toUser,double amount) {
		this.amount=amount;
		this.fromUser=fromUser;
		this.toUser = toUser;
		
	}

}
