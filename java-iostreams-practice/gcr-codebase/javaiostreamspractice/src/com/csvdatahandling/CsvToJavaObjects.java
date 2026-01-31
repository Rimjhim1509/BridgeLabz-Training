package com.csvdatahandling;
import java.util.*;
import java.io.*;

class Student {
	int id ;
	String name ;
	int marks;
	int age;
	 int grade;
	public Student(int id , String name ,int marks , int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks= marks;
	}
}

public class CsvToJavaObjects {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader("src/source/students.csv"))) {

            // skip header
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split("\\s*,\\s*");

                if (data.length < 4) {
                    continue;
                }

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                Student s = new Student(id, name, age, marks);
                students.add(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // print students
        for (Student s : students) {
            System.out.println(
                s.id + " " + s.name + " " + s.age + " " + s.marks
            );
        }
    }
}
