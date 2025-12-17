import java.util.*;

//Create class Calculator to perform addition, subtraction, multiplication, and division.
public class Calculator {
	
	public static void main(String[] args){
		
		// Create Scanner Object to take user input 
		Scanner sc = new Scanner(System.in);
		
		//Create two variable as number1 and number2
		System.out.print("Enter the ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		// Logic of Add,Subtract,Multiplicate, Divide.
		int addition = number1 + number2;
		int subtract = number1 - number2;
		int multiplication = number1* number2;
		int division = number1/number2 ;
		//Print the output
		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+number1+ "and" +number2+ " is " + addition+ ", " + subtract 
						 +", "+ multiplication+" and " + division);
	}
}