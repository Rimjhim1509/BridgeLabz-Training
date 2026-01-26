package com.regex;

public class CreditCardValidator {
    
    private static final String VISA_REGEX = "^4[0-9]{15}$";
    private static final String MASTERCARD_REGEX = "^5[1-5][0-9]{14}$";  // stricter: 51-55

    public static String validateCard(String number) {
        if (number == null || number.isEmpty()) {
            return "Invalid (empty)";
        }

        // Remove spaces and dashes (common in user input)
        String clean = number.replaceAll("[\\s-]", "");

        if (clean.matches(VISA_REGEX)) {
            return "Valid Visa";
        }
        if (clean.matches(MASTERCARD_REGEX)) {
            return "Valid MasterCard";
        }
        return "Invalid";
    }

    public static void main(String[] args) {
        String[] tests = {
            "4123456789012345",         
            "4512345678901234",        
            "5112345678901234",         
            "5312345678901234",        
            "5512345678901234",        
            "5612345678901234",        
            "4123 4567 8901 2345",     
            "412345678901234"
        };

        for (String test : tests) {
            System.out.printf("%-25s : %s%n", test, validateCard(test));
        }
    }
}