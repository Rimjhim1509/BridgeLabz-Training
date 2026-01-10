package com.Artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price) {
        super(title, artist, price, "Print License");
    }

    @Override
    public void purchase(User user) {
        user.deductBalance(price);
        System.out.println("Print art purchased: " + title);
    }

    @Override
    public void license() {
        System.out.println("Licensed for one physical print.");
    }
}
