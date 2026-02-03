package com.collectors;
import java.util.*;
import java.util.stream.Collectors;
class Student{
	String name;
	String grade ;
	Student(String name , String grade){
		this.name = name;
		this.grade =grade ;
	}
}
public class StudentResult {
	public static void main(String[] args) {
		//Group students by grade level and collect names.
		List<Student> students = Arrays.asList( new Student("student1", "A") , 
												new Student("student2" , "B"),
												new Student("student4" , "A"),
												new Student("student5" , "C"),
												new Student("student6" , "A"),
												new Student("student7" , "B"),
												new Student("student22" , "B"),
												new Student("student31" , "C"));
		Map<String , List<String>> result = students.stream()
				.collect(
						Collectors.groupingBy(s ->s.grade,
								Collectors.mapping(s -> s.name , Collectors.toList())));
	System.out.print(result);
	}
}
