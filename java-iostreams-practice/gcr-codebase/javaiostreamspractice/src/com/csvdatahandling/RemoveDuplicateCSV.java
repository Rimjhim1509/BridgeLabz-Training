package com.csvdatahandling;

import java.io.*;
import java.util.*;

public class RemoveDuplicateCSV {

    public static void main(String[] args) {

        String filePath = "src/source/large.csv";

        Set<String> seenIds = new HashSet<>();
        List<String> duplicateRows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader(filePath))) {

            String line;

            // skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split("\\s*,\\s*");
                if (data.length < 1) continue;

                String id = data[0];

                // if add() returns false → duplicate
                if (!seenIds.add(id)) {
                    duplicateRows.add(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print duplicates
        System.out.println("Duplicate records:");
        for (String row : duplicateRows) {
            System.out.println(row);
        }
    }
}
