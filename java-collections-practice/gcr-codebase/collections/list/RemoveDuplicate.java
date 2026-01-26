package com.collections.list;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class RemoveDuplicate {
	public static List<Integer>removeDuplicate(List<Integer> list){
		Set<Integer> set =new LinkedHashSet<>(list);
		return new ArrayList<>(set);
	}
	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(3,1,3,1,3,1,2,5,6,7,8);
		System.out.println(removeDuplicate(list));
	}
}
