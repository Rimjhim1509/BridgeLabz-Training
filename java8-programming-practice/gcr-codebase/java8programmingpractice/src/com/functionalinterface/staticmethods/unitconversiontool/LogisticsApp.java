package com.functionalinterface.staticmethods.unitconversiontool;

public class LogisticsApp {
	public static void main(String[] args) {
		double distanceKms = 120.0;
		double weightKg = 34 ;
		double distanceMiles = UnitConverter.kmtoMiles(distanceKms);
		double convertWeight = UnitConverter.kgToLbs(weightKg);
		System.out.println("Distance in miles: " + distanceMiles);
        System.out.println("Weight in lbs: " + convertWeight);

	}
}
