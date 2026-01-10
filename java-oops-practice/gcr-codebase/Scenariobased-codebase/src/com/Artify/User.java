package com.Artify;

public class User {
private String name;
private double walletBalance ;
public User(String name , double walletBalance) {
	this.name = name;
	this.walletBalance = walletBalance;	
}
public void deductBalance(double amount ) {
	walletBalance-=amount;	
}
public double getWalletBalance() {
	return walletBalance;
}
}
//● Interface IPurchasable with purchase() and license() methods.
//● Encapsulation: licensing terms are protected.
//● Use constructors to initialize artworks with or without previews.
//● Operators: deduct wallet balance on purchase.
//● Inheritance: DigitalArt, PrintArt from Artwork.
//● Polymorphism: licensing varies across art types.
