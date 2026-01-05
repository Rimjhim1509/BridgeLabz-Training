package com.encapsulation.hospitalpatientmanagement;

public class Main {

    public static void main(String[] args) {

        Patient p1 = new InPatient(1, "Ravi", 30, 5, 2000);
        Patient p2 = new OutPatient(2, "Anita", 25, 500);

        p1.getPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());

        p2.getPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());
    }
}
