package com.regex;

public class IPv4Validator {
    
    private static final String IPV4_REGEX = 
        "^(?:25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(?:\\.(?:25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)){3}$";

    public static boolean isValidIPv4(String ip) {
        if (ip == null) return false;
        return ip.matches(IPV4_REGEX);
    }

    public static void main(String[] args) {
        String[] tests = {
            "192.168.1.1",          // valid
            "255.255.255.255",      // valid
            "0.0.0.0",              // valid
            "256.1.2.3",            // invalid (256 > 255)
            "192.168.001.1",        // invalid (leading zero)
            "192.168.1",            // invalid (only 3 parts)
            "192.168.1.1.1",        // invalid (5 parts)
            "192.168.1.01",         // invalid (leading zero)
            "10.0.0.137"            // valid
        };

        for (String test : tests) {
            System.out.printf("%-20s : %s%n", test, isValidIPv4(test) ? "Valid" : "Invalid");
        }
    }
}