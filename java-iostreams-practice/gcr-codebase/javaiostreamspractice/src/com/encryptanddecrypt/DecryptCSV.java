package com.encryptanddecrypt;
import java.io.*;

import javax.crypto.SecretKey;
public class DecryptCSV {

    public static void main(String[] args) {
        try {
            SecretKey key = CryptoUtils.generateKey(); // Use the same key as encryption!
            String inputFile = "employees_encrypted.csv";

            try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
                String header = br.readLine();
                System.out.println(header);

                String line;
                while ((line = br.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;
                    String[] data = line.split("\\s*,\\s*");

                    String id = data[0];
                    String name = data[1];
                    String dept = data[2];
                    String salaryDecrypted = CryptoUtils.decrypt(data[3], key);

                    System.out.println(id + "," + name + "," + dept + "," + salaryDecrypted);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
