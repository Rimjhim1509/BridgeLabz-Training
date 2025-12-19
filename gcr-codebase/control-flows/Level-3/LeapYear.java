import java.util.*;
//Create class to print the year is Leap or not
public class LeapYear {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
		System.out.print("Enter the year : ");
		int year = sc.nextInt();
		
		if(year <=1582){
			System.out.print("it is not a gregorian year");
		}
		//print	 the multiples through While
		if(year % 400 == 0 ){
			System.out.print("Leap year");
		}
		else if(year % 100 == 0){
			System.out.print(" Not a Leap year");
		}
		else if(year % 4 == 0){
			System.out.print("Leap year");
		}
		else{
			System.out.print("Not a Leap year");
		}
		
		
	}
}