import java.util.*;
//Create the class NaturalNumberSum to check natural number and print the Sum of n Natural numbers
public class NaturalNumberSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Take the input 
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		//Check the number is positive or not
		if(number > 0){
			int sum = (number * (number+1))/2 ;
			System.out.print("The sum of" + number + "natural numbers is "+ sum);
		}else{
			System.out.print("The number  " +number+ " is not a natural number");
		}
		
	}
}
