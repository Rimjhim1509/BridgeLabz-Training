package com.csvdatahandling;

import java.io.*;
import java.util.*;
import org.json.*;

public class JSONCSVConverter {

    // Convert JSON array to CSV
    public static void jsonToCsv(String jsonFile, String csvFile) {
        try {
            String content = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(jsonFile)));
            JSONArray jsonArray = new JSONArray(content);

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
                // Write CSV header
                bw.write("id,name,age,marks");
                bw.newLine();

                // Write CSV rows
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject obj = jsonArray.getJSONObject(i);
                    bw.write(
                        obj.getInt("id") + "," +
                        obj.getString("name") + "," +
                        obj.getInt("age") + "," +
                        obj.getInt("marks")
                    );
                    bw.newLine();
                }
            }

            System.out.println("JSON → CSV conversion done.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Convert CSV back to JSON
    public static void csvToJson(String csvFile, String jsonFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line = br.readLine(); // skip header
            JSONArray jsonArray = new JSONArray();

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                String[] data = line.split("\\s*,\\s*");
                JSONObject obj = new JSONObject();
                obj.put("id", Integer.parseInt(data[0]));
                obj.put("name", data[1]);
                obj.put("age", Integer.parseInt(data[2]));
                obj.put("marks", Integer.parseInt(data[3]));

                jsonArray.put(obj);
            }

            // Write JSON to file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFile))) {
                bw.write(jsonArray.toString(4)); // pretty print with indentation
            }

            System.out.println("CSV → JSON conversion done.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String jsonInput = "students.json";
        String csvOutput = "students.csv";
        String jsonOutput = "students_converted.json";

        jsonToCsv(jsonInput, csvOutput);
        csvToJson(csvOutput, jsonOutput);
    }
}
