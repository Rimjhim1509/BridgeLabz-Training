package com.ewalletsystem;

public class User {
	private int userId;
	private String name;
	private Wallet wallet;
	User(int userId,String name, Wallet wallet){
		this.name =name;
		this.userId =userId;
		this.wallet = wallet;
	}
	public Wallet getWallet() {
        return wallet;
    }

    public String getName() {
        return name;
    }

}
