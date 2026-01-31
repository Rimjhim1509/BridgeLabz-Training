package com.csvdatahandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GenerateCSVReport {

    public static void main(String[] args) { 

        String dbUrl = "jdbc:mysql://localhost:3306/testdb";
        String dbUser = "root";
        String dbPassword = "Rimjhim@1509";

        String outputFile = "src/source/employeesData.csv";

        String query = "SELECT id, name, department, salary FROM employees";

        try (
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            // Write header
            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            // Write data
            while (rs.next()) {

                String id = rs.getString("id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                String salary = rs.getString("salary");

                bw.write(id + "," + name + "," + department + "," + salary);
                bw.newLine();
            }

            System.out.println("CSV report generated successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
