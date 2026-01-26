package com.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(7,4,2,6,4));
		Set<Integer> unionIntegers=new HashSet<>(set1);
		unionIntegers.addAll(set2);
		Set<Integer> intersection =new HashSet<>(set1);
		
		intersection.retainAll(set2);
		System.out.println("Union "+ unionIntegers);
		System.out.println("intersection "+ intersection);
	}
	
}
