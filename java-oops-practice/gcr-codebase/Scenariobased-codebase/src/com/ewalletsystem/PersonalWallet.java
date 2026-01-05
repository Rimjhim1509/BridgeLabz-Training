package com.ewalletsystem;

 class PersonalWallet extends Wallet  {
	PersonalWallet(double balance){
		super(balance);
	}

	@Override
	public void transferTo(User receiver, double amount) {
		if(amount<=balance && amount <= 5000) {
			balance-=amount;
			receiver.getWallet().loadMoney(amount);
		}else {
			System.out.println("Limit exceed");

		}
		
	}
}
