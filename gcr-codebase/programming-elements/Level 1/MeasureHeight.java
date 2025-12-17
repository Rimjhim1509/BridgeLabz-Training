import java.util.*;
//create class that takes your height in centimeters and converts it into feet and inches
public class MeasureHeight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter your height in cm : ");
	//Create a variable to take height
	int height = sc.nextInt();
	//Create the variable inch_height to calculate the height in inches
	double inch_height = height / 2.54 ;
	//Create the variable heightFoot to calculate the height in Foot.
	double heightFoot = inch_height / 12;
	//Print the output
	System.out.print("Your Height in cm is "+inch_height+ " while in feet is "+ "and inches is "+heightFoot);
	
	}
	
}