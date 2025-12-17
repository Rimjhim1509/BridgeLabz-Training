import java.util.*;
//Create a class to compute the distance in Miles from kilometer
public class KilometerToMileInput {
	public static void main(String[] args){
		// Create Scanner Object to take user input from Standard Input
		Scanner input = new Scanner(System.in);
		//Create variable km show measured in kilometers 
		double km  = input.nextInt();
		// Create the miles variable to calculate the distance in miles.
		double miles = km / 1.6 ;
		//print the output
		System.out.print(" The total miles is "+miles+ "  mile for the given "+ km + " km.");
	}
}