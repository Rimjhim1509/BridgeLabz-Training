package com.functionalinterface.digitalpay;

class UPIPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
