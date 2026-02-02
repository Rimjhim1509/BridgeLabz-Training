package com.functionalinterface.digitalpay;

public class Main {
    public static void main(String[] args) {

        Payment p1 = new UPIPayment();
        Payment p2 = new CreditCardPayment();
        Payment p3 = new WalletPayment();

        p1.pay(500);
        p2.pay(1200);
        p3.pay(300);
    }
}
