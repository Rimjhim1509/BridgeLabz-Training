package com.csvdatahandling;

import java.io.*;

public class ReadLargeCSV {

    public static void main(String[] args) {

        String filePath = "src/source/large.csv";

        int totalCount = 0;
        int batchCount = 0;

        try (BufferedReader br = new BufferedReader(
                new FileReader(filePath))) {

            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                batchCount++;
                totalCount++;

           
                if (batchCount == 100) {
                    System.out.println("Processed records: " + totalCount);
                    batchCount = 0;
                }
            }

            if (batchCount > 0) {
                System.out.println("Processed records: " + totalCount);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
