package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterCSV {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/source/students.csv"))) {

            // header skip
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
