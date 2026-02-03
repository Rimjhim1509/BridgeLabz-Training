package com.streamapi.foreach;

import java.util.*;

public class PrintWelcomeMessage {
public static void main(String[] args) {
	List<String> attendee = Arrays.asList("Attendee 1" , "Attendee2","Attendee3");
	attendee.stream().forEach(name -> System.out.println("Welcome to the venue "+ name));
	
	}
}
