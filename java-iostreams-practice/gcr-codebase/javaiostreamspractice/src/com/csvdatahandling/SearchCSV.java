package com.csvdatahandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchCSV {

    public static void main(String[] args) {

        String searchName = "Anita"; 

        try (BufferedReader br = new BufferedReader(new FileReader("src/source/employees.csv"))) {

         
            br.readLine();

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                if (data.length < 4) {
                    continue;
                }

                String name = data[1].trim();
                String department = data[2].trim();
                String salary = data[3].trim();

                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + department);
                    System.out.println("Salary: " + salary);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
