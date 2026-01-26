package com.collections.map.groupingobjects;

import java.util.*;

public class GroupByDepartment {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
			new Employee("Alice", "HR"),
			new Employee("Bob", "IT"),
			new Employee("Carol", "HR")
		);

		Map<String, List<Employee>> deptMap = new HashMap<>();

		for (Employee emp : employees) {

			if (!deptMap.containsKey(emp.department)) {
				deptMap.put(emp.department, new ArrayList<>());
			}
			deptMap.get(emp.department).add(emp);
		}

		System.out.println(deptMap);
	}
}
