package com.csvdatahandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class UpdateCSV {
	public static void main(String[] args) {
		String inputFile = "src/source/employees.csv";
		String outputFile = "src/source/updatedEmployees.csv";
		try(
			BufferedReader br = new BufferedReader(new FileReader(inputFile));
			BufferedWriter wr = new BufferedWriter(new FileWriter(outputFile));
				){
			String line;
			line= br.readLine();
			wr.write(line);
			wr.newLine();
			while((line = br.readLine())!=null) {
				if(line.trim().isEmpty()) {
					continue;
				}
				String[] data = line.split(",");
				if(data.length < 4) {
					continue;
				}
				String id = data[0].trim();
				//Name,Department,Salary
				String name = data[1].trim();
				String department = data[2].trim();
				double salary = Double.parseDouble(data[3].trim());
				if(department.equalsIgnoreCase("IT")) {
					salary = salary + (salary*0.10);
				}
				wr.write(id + "," + name + "," + department + "," + (int) salary);
                wr.newLine();
                
			}
			System.out.print("csv updated .");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
