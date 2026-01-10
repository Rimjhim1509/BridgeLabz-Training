package com.MediStore;

import java.time.LocalDate;
public class Injection extends Medicine{
	public Injection(String name , double price , LocalDate expiryDate) {
		super(name,price,expiryDate);
	}
	public boolean checkExpiry() {
		return expiryDate.isAfter(LocalDate.now().plusDays(5));
	}
	public double sell(int qty) {
        if (checkExpiry() && reduceStock(qty)) {
            return price * qty;
        }
        return 0;
    }

}
