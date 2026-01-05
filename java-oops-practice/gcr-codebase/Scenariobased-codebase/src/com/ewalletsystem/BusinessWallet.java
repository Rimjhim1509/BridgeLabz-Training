package com.ewalletsystem;

class BusinessWallet extends Wallet  {
	BusinessWallet(double balance){
		super(balance);
	}

	@Override
	public void transferTo(User receiver, double amount) {
		double tax =amount *0.02;
		double total=amount+tax;
		if(total<=balance) {
			balance-=amount;
			receiver.getWallet().loadMoney(amount);
		}else {
			System.out.println("Limit exceed");

		}
		
	}
}
