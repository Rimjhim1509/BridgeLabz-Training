package com.streamapi.foreach;
import java.util.*;
public class EmailNotification {
	public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@example.com",
                "user2@example.com",
                "user3@example.com"
        );
        emails.stream().forEach(a -> sendEmail(a));
        
         	}
    static void  sendEmail(String email) {
   	System.out.println("Sent notification to "+ email);
   }

}
//emails.forEach(email -> sendEmailNotification(email));