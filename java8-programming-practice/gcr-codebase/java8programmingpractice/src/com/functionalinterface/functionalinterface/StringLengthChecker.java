package com.functionalinterface.functionalinterface;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int limit = 100;

        Function<String, Integer> lengthFunction =
                message -> message.length();

        String message = "This is a sample notification message";

        int length = lengthFunction.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds character limit");
        } else {
            System.out.println("Message is within limit");
        }
    }
}
