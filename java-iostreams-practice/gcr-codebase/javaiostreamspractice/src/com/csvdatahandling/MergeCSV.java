package com.csvdatahandling;

import java.util.*;
import java.io.*;

class StudentData {
    String id;
    String name;
    String age;
    String marks;
    String grade;

    StudentData(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
public class MergeCSV {

    public static void main(String[] args) {

        Map<String, StudentData> map = new HashMap<>();

        // READ students1.csv
        try (BufferedReader br = new BufferedReader(
                new FileReader("students1.csv"))) {

            br.readLine(); // skip header
            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split("\\s*,\\s*");
                if (data.length < 3) continue;

                String id = data[0];
                String name = data[1];
                String age = data[2];

                map.put(id, new StudentData(id, name, age));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        
        try (BufferedReader br = new BufferedReader(
                new FileReader("students2.csv"))) {

            br.readLine(); // skip header
            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split("\\s*,\\s*");
                if (data.length < 3) continue;

                String id = data[0];

                if (map.containsKey(id)) {
                    StudentData s = map.get(id);
                    s.marks = data[1];
                    s.grade = data[2];
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("merged.csv"))) {

            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            for (StudentData s : map.values()) {
                bw.write(
                    s.id + "," +
                    s.name + "," +
                    s.age + "," +
                    s.marks + "," +
                    s.grade
                );
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("CSV files merged successfully.");
    }
}
