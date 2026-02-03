package com.streamapi;

import java.util.Arrays;
import java.util.*;
 class Customer{
	String name ;
	Customer(String name){
		this.name =name;
	}
}
public class SortedCustomer {
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				new Customer("customer1"),
				new Customer("customer4"),
				new Customer("customer3")
				);
		customers.stream().map(c -> c.name.toUpperCase())
						  .sorted()
						  .forEach(System.out::println);
	}
}

//when we are making object we are using c.name.toUpperCase() and we are using direct list then we use String ::toUpperCase
//because java 8 on stream is string instead of s -> s.toUpperCase() to String::toUpperCase
