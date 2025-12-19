import java.util.*;
//Create class to print the year is Leap or not
public class LogicalLeapyear {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
		System.out.print("Enter the year : ");
		int year = sc.nextInt();
		
		if(year <=1582){
			System.out.print("it is not a gregorian year");
		}
		
		if(year % 400 == 0 && (year % 100 == 0 || year % 4 == 0)){
			System.out.print("Leap year");
		}
		else{
			System.out.print("Not a Leap year");
		}
		
		
	}
}