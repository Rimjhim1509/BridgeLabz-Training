package com.collections.set;

import java.util.*;

public class SetToSortedList {
	public static void main(String[] args) {
		Set<Integer> set =new HashSet<>(Arrays.asList(3,4,2,4));
		List<Integer> list =new ArrayList<>(new TreeSet<>(set));
		Collections.sort(list);
		System.out.print(list);
	}
}
