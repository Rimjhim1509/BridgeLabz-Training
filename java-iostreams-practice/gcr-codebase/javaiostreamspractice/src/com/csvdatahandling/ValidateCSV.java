package com.csvdatahandling;

import java.util.*;
import java.io.*;
public class ValidateCSV {
//	Read a CSV file
//	Validate:
//	Email → valid format (regex)
//	Phone → exactly 10 digits
//	Print invalid rows with a clear error message
//	Skip header
	
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("src/source/validateemployee.csv"))){
			br.readLine();
			String line =br.readLine();
			while(line!=null) {
				if(line.trim().isEmpty()) {
					continue;
				}
				String[] data = line.split(",");
				if(data.length < 4) {
					continue;
				}
				String email = data[2];
				String phone = data[3];
				boolean isValid = true;
				if(!email.matches("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+")) {
					 
					System.out.println("Invalid email.--> "+ email+" of -->   "+line );
					isValid = false;
				}
				if(!phone.matches("[0-9]{10}")) {
					System.out.println("Invalid phone.");
					isValid = false;
				}
				line=br.readLine();
			}
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
