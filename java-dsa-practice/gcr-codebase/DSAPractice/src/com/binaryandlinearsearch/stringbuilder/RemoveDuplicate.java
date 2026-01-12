package com.binaryandlinearsearch.stringbuilder;
import java.util.*;
public class RemoveDuplicate {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		char[] ch = s.toCharArray();
		
		for(char c : ch) {
			if(!set.contains(c)) {
				sb.append(c);
				set.add(c);
			}
		}
		System.out.print(sb.toString());
	}
	
}
