import java.util.*;

//Create the class to find the distance in yards and miles for the distance provided by user in feets

public class DistanceYard{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//create the variable distanceInFeet to take input as distance in feet
		System.out.print("Enter the distance in feet : ");
		int distanceInFeet = sc.nextInt();
		//Create the variable  by feet distance using division operator
		int distance_yard = distanceInFeet /3 ;
		//create the variable distance_mile using division operator
		double distance_mile = distance_yard /1760.0 ; 
		System.out.print("Your distance in feet is " + distanceInFeet+ " and yard is " + distance_yard + " and in mile is " + distance_mile);
	}
}