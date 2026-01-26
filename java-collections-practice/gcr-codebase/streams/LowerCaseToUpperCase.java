package com.streams;

import java.io.*;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {

        File inputFile = new File("Name.txt");
        File outputFile = new File("Result.txt");

        if (!inputFile.exists()) {
            System.out.println("Input file does not exist!");
            return;
        }

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            int ch;

            while ((ch = reader.read()) != -1) {
                // lower case to upper case
                if (ch >= 97 && ch <= 122) {
                    ch -= 32;
                }
                writer.write(ch);
            }

            System.out.println("Copied successfully!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
