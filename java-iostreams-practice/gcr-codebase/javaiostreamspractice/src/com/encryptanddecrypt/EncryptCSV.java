package com.encryptanddecrypt;

import java.io.*;
import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
public class EncryptCSV {

    public static void main(String[] args) {
        try {
            SecretKey key = CryptoUtils.generateKey(); // Keep this key safe!
            String outputFile = "employees_encrypted.csv";

            List<String[]> employees = Arrays.asList(
                new String[]{"1", "Rahul", "IT", "50000"},
                new String[]{"2", "Anita", "HR", "45000"},
                new String[]{"3", "Aman", "Finance", "60000"}
            );

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                bw.write("ID,Name,Department,Salary");
                bw.newLine();

                for (String[] emp : employees) {
                    String id = emp[0];
                    String name = emp[1];
                    String dept = emp[2];
                    String salaryEncrypted = CryptoUtils.encrypt(emp[3], key);

                    bw.write(id + "," + name + "," + dept + "," + salaryEncrypted);
                    bw.newLine();
                }
            }

            System.out.println("Encrypted CSV written successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
