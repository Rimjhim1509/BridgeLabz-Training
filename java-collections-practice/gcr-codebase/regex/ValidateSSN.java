package com.regex;

public class ValidateSSN {
    public static void main(String[] args) {
        String ssn1 = "123-45-6789";
        String ssn2 = "123456789";

        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        System.out.println(ssn1.matches(regex) ? "Valid" : "Invalid");
        System.out.println(ssn2.matches(regex) ? "Valid" : "Invalid");
    }
}
