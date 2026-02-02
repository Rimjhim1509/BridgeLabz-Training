package com.functionalinterface.digitalpay;

class WalletPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
