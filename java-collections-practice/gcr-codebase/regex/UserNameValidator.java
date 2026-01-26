package com.regex;

import java.util.Scanner;

public class UserNameValidator {

    public static boolean isValidUsername(String username) {
    	//first letter must be letter [a-zA-Z]
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (isValidUsername(username)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}
