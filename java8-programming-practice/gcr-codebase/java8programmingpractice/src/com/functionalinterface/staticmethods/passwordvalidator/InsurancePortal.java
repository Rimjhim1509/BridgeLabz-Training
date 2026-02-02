package com.functionalinterface.staticmethods.passwordvalidator;

public class InsurancePortal {

    public static void main(String[] args) {

        String password = "Insure123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Password accepted");
        } else {
            System.out.println("Weak password");
        }
    }
}
