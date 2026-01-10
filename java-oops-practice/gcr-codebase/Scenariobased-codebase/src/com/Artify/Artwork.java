package com.Artify;

public abstract class Artwork implements IPurchasable  {
	protected String title ;
	protected String artist ;
	protected double price ;
	protected String licenseType;
	public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }
	public abstract void license();
	}

//Artwork class: title, artist, price, licenseType.
//● User class: name, walletBalance.
//● Interface IPurchasable with purchase() and license() methods.
//● Encapsulation: licensing terms are protected.
//● Use constructors to initialize artworks with or without previews.
//● Operators: deduct wallet balance on purchase.
//● Inheritance: DigitalArt, PrintArt from Artwork.
//● Polymorphism: licensing varies across art types.
