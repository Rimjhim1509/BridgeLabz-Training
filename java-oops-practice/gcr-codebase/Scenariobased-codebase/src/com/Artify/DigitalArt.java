package com.Artify;

public class DigitalArt extends Artwork {
	public DigitalArt(String title, String artist, double price) {
        super(title, artist, price, "Digital License");
    }
	public void purchase(User user) {
		user.deductBalance(price);
        System.out.println("Digital art purchased: " + title);
	}
	public  void license() {
		System.out.println("Licensed for personal digital use.");
	}
}
