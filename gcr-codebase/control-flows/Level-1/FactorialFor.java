import java.util.*;
//Create class to compute factorial using For
public class FactorialFor {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer : ");
		int number = sc.nextInt();
		
		//check the user's input if its positive,
		if(number < 0){
			System.out.print("It is not a positive integer");
			return;
		}
		//use for loop to compute factorial.,
		//n*(n-1)*(n-2)..*1
		int factorial = 1 ;
		for(int i = number ; i > 0 ; i--){
			factorial = factorial*i;
		}
		System.out.print("The factorial is " + factorial);
		sc.close();
	}
}