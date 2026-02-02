package com.functionalinterface.markerinterface.sensitivedatatagging;

public class EncryptionService {

    public static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
            // encryption logic here
        } else {
            System.out.println("No encryption needed");
        }
    }
}
