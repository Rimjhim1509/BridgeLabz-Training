package com.functionalinterface.functionalinterface.temperaturealertsystem;
import java.util.function.*;
public class PredicateTemperatur {
	public static void main(String[] args) {
		double threshold =7.5;
		Predicate<Double> temperaturAlert = temp -> temp >threshold ;
		double temperatureCurrent =3 ;
		if (temperaturAlert.test(temperatureCurrent)) {
            System.out.println("ALERT: Temperature crossed threshold!");
        } else {
            System.out.println("Temperature is normal.");
        }

	}
}
