package com.MediStore;

import java.time.LocalDate;

public class MediStore {
    public static void main(String[] args) {

        Medicine med = new Tablet("Paracetamol", 10,
                LocalDate.now().plusMonths(6));

        double bill = med.sell(5);

        System.out.println("Total Bill: ₹" + bill);
        System.out.println("Remaining Stock: " + med.getQuantity());
    }
}
