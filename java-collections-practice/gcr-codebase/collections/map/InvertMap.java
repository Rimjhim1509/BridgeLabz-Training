package com.collections.map;

import java.util.List;
import java.util.*;

public class InvertMap {
	public static void main(String[] args) {
		Map<String , Integer> input = new HashMap<>();
		input.put("A", 1);
		input.put("B", 1);
		input.put("C", 2);
		Map<Integer, List<String>> output = new HashMap<>();
		for (String key : input.keySet()) {
			Integer value = input.get(key);

			if (!output.containsKey(value)) {
				output.put(value, new ArrayList<>());
			}
			output.get(value).add(key);
		}

		System.out.println(output);

	}
}
