import java.util.*;
//Create class to compute factorial
public class FactorialWhile {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer : ");
		int number = sc.nextInt();
		
		int temp = number;
		//check the user's input if its positive,
		if(number < 0){
			System.out.print("It is not a positive integer");
			return;
		}
		//use while loop to compute factorial.,
		//n*(n-1)*(n-2)..*1
		int factorial = 1 ;
		while(temp >= 1){
			factorial = factorial*temp ; 
			temp--;
		}
		System.out.print("The factorial is " + factorial);
	}
}