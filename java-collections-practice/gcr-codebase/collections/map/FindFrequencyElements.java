package com.collections.map;

import java.util.*;
public class FindFrequencyElements {
	public static Map<String,Integer> findFrequency(List<String> list){
		Map<String, Integer> freqMap = new HashMap<>();
		for(String item :list) {
			if(freqMap.containsKey(item)) {
				freqMap.put(item, freqMap.get(item) +1);
			}else {
				freqMap.put(item, 1);
			}
		}
		return freqMap;
	}
	public static void main(String[] args) {
		List<String>list = Arrays.asList("apple","banana","apple","banana","orange"); 
		Map<String,Integer> result =findFrequency(list);
		System.out.print(result);
	}
}
