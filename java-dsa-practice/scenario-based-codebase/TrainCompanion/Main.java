package com.TrainCompanion;

public class Main {
	public static void main(String[] args){
		TrainCompanion train = new TrainCompanion();
		train.addCompartment("c1");
		train.addCompartment("c2");
		train.addCompartment("Pantry");
		train.addCompartment("WIFI");
		train.addCompartment("CS");

        train.forwardTraverse();
        train.backwardTraverse();

        System.out.println();
        train.showAdjacent("Pantry");

        System.out.println();
        train.removeCompartment("WiFi");

        train.forwardTraverse();

	}
}
