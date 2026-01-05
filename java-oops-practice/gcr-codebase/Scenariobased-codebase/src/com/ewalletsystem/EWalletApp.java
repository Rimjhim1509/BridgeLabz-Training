package com.ewalletsystem;

public class EWalletApp {
public static void main(String[] args) {
	Wallet w1 =new PersonalWallet(10000);
	Wallet w2 =new BusinessWallet(10000);

	User u1 =new User(1,"zombie",w1);
	User u2 = new User(2, "Anita", w2);

    w1.transferTo(u2, 3000);
    w2.transferTo(u1, 5000);

    System.out.println("Ravi Balance: " + w1.getBalance());
    System.out.println("Anita Balance: " + w2.getBalance());

}
}
