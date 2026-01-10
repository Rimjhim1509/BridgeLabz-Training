package com.Artify;

public class ArtifyApp {

    public static void main(String[] args) {

        // User created with wallet balance
        User buyer = new User("Rimjhim", 5000);

        
        Artwork art1 = new DigitalArt(
                "Neon City",
                "Alex",
                1200
        );

        Artwork art2 = new PrintArt(
                "Mountain Sketch",
                "Sophia",
                800
        );

        // Initial Wallet Balance
        System.out.println("Initial Wallet Balance: ₹" + buyer.getWalletBalance());
        
        // Purchase Digital Art
        art1.purchase(buyer);
        art1.license();

        System.out.println("Wallet Balance after Digital Art: ₹" + buyer.getWalletBalance());
        

        // Purchase Print Art
        art2.purchase(buyer);
        art2.license();

        System.out.println("Wallet Balance after Print Art: ₹" + buyer.getWalletBalance());
        
    }
}
