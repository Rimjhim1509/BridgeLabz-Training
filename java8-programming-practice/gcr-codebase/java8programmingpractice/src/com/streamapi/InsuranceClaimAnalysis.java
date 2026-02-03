package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;

class Claim{
	String type;
	double amount;
	public Claim(String type , double amount) {
		this.type =type;
		this.amount =amount;
	}
}
public class InsuranceClaimAnalysis {
	public static void main(String[] args) {
		List<Claim> claims = List.of(
                new Claim("Health", 50000),
                new Claim("Vehicle", 20000),
                new Claim("Health", 30000),
                new Claim("Home", 40000),
                new Claim("Vehicle", 25000)
        );	
		Map<String , Double> avgByType = claims.stream().collect(
				Collectors.groupingBy(
						c -> c.type , Collectors.averagingDouble(c ->c.amount))
				);
		System.out.print(avgByType);
	}
}
