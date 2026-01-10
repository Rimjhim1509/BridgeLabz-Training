package com.MediStore;

import java.time.LocalDate;
public class Syrup extends Medicine{
	public Syrup(String name , double price , LocalDate expiryDate) {
		super(name,price,expiryDate);
	}
	public boolean checkExpiry() {
		return expiryDate.isAfter(LocalDate.now().plusDays(10));
	}
	public double sell(int qty) {
        if (checkExpiry() && reduceStock(qty)) {
            return price * qty;
        }
        return 0;
    }

}
