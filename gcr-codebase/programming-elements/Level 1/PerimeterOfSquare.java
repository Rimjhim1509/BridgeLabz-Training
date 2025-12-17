import java.util.*;
// Create class to calculate the sides from the perimeter of sqqaure
public class PerimeterOfSquare{
	public static void main (String[] args){
		//Create the Scanner object
		Scanner sc = new Scanner(System.in);
		// Take input as perimeter
		int perimeter = sc.nextInt();
		// Calculate side from perimeter
		int side = perimeter /4;
		
		System.out.print("The length of the side is " + side+" whose perimeter is "+ perimeter);
		
	}
}