package com.MediStore;

import java.time.*;
public class Tablet extends Medicine{
	public Tablet(String name , double price , LocalDate expiryDate) {
		super(name,price,expiryDate);
	}
	public boolean checkExpiry() {
		return expiryDate.isAfter(LocalDate.now());
	}
	public double sell(int qty) {
        if (checkExpiry() && reduceStock(qty)) {
            return price * qty;
        }
        return 0;
    }

}
