package com.functionalinterface.markerinterface.sensitivedatatagging;
public class Main {
    public static void main(String[] args) {

        UserCredential creds = new UserCredential("admin", "1234");
        Product product = new Product("Laptop", 50000);

        EncryptionService.process(creds);
        EncryptionService.process(product);
    }
}
