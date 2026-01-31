package com.csvdatahandling.ReadCSV;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CountCSVRows {
	public static void main(String[] args) {
		String filepath = "src/source/students.csv";
		int count = 0 ;
		try(BufferedReader br  = new BufferedReader(new FileReader(filepath))){
			
			br.readLine();
			String line;
			while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count++;
                }
            }
			System.out.println("Total records (excluding header): " + count);

		}catch(IOException e) {
			e.printStackTrace();
		}
				
	}
}
