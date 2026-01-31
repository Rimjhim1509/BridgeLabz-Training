package com.csvdatahandling;

import java.io.*;
import java.util.*;

class Employee{
	String id;
	String name;
	String department ;
	double salary ;
	public Employee(String id , String name , String department , double salary) {
		this.name= name;
		this.id = id;
		this.department=department ; 
		this.salary = salary;
	}
}
public class SortCSV {
	public static void main(String[] args) {
		
	
		List<Employee> employees = new ArrayList<>();
	try(BufferedReader br = new BufferedReader(new FileReader("src/source/employees.csv"))){
		br.readLine();
		String line= br.readLine();
		while(line!=null){
			
			if(line.trim().isEmpty()) {
				continue;
			}
			String[] data = line.split("\\s*,\\s*");
			if(data.length <4) {
				continue;
			}
			String id = data[0] ;
			String name = data[1] ;
			String dept = data[2] ;
			double salary = Double.parseDouble(data[3]);
			employees.add(new Employee(id,name,dept,salary));
			Collections.sort(employees , (e1,e2)-> Double.compare(e2.salary , e1.salary));
			line= br.readLine();
					}
		System.out.println("Top 5 highest-paid employees:");
        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            Employee e = employees.get(i);
            System.out.println(e.id + "," + e.name + "," + e.department + "," + e.salary);

	}
		
			}
			
			catch(IOException e) {
		e.printStackTrace();
	}

	}
	
	
}

