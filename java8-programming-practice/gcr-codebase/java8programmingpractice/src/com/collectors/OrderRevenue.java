package com.collectors;
import java.util.*;
import java.util.stream.Collectors;
 class Order{
	String name ;
	double amount ;
	public Order(String name , double amount) {
		this.amount = amount ;
		this.name=name;
	}
}
public class OrderRevenue {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
                new Order("customer1", 250.0),
                new Order("customer2", 400.0),
                new Order("customer1", 150.0),
                new Order("customer3", 300.0),
                new Order("customer2", 100.0)
        );
		Map<String, Double> results = orders.stream()
				.collect(Collectors.groupingBy(order -> order.name ,
						Collectors.summingDouble(order-> order.amount))); 
		System.out.print(results);
	}
}
