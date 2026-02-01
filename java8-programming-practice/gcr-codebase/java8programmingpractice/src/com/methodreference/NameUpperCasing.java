package com.methodreference;

import java.util.*;
import java.util.stream.*;
public class NameUpperCasing {
	public static void main(String[] args) {
		List<String> employees = Arrays.asList("employeeOne","employeeTwo", "employeeThree");
		List<String> upperCaseEmployee = employees.stream().map(String::toUpperCase).collect(Collectors.toList());
		upperCaseEmployee.forEach(System.out::println);
		
	}
}
