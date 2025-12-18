import java.util.*;
//Create class to find the sum of n natural numbers using while loop 
 public class SumOfNumberFor {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//take the input
		
		System.out.print("Enter the number : ");
		int number  = sc.nextInt();
		if(number < 0){
			System.out.print("it is not natural number");
			return;
		}
		//here we are storing for temporary
		int sumup = number ;
		//create a variable sum to store sum via formula
		int sum = 0;
		//solving sum via while,
		//first check the number is positive or not
		
		while(sumup > 0){   //till the sumup(temp) variable is positive,and not zero
			sum += sumup;
			sumup--;
		}
		
		int sumFormula = (number*(number+1))/2 ; //formula based
		if(sumFormula == sum){
			System.out.println("Sum is equal in both");
		}
		else{
			System.out.println("Sum is not equal in both");
		}
			
		System.out.println("The result from formula is "+sumFormula+" and from from while is "+ sum);
	}
 }
