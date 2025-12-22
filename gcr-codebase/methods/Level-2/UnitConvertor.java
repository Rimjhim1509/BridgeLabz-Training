import java.util.Scanner;

public class MathCalculations {
	 public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
	}
public class UnitConvertorTest {

    public static void main(String[] args) {

        System.out.println("10 km in miles = " +
                UnitConvertor.convertKmToMiles(10));

        System.out.println("6.2 miles in km = " +
                UnitConvertor.convertMilesToKm(6.2));

        System.out.println("5 meters in feet = " +
                UnitConvertor.convertMetersToFeet(5));

        System.out.println("16.4 feet in meters = " +
                UnitConvertor.convertFeetToMeters(16.4));
    }
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		
    }
}
 