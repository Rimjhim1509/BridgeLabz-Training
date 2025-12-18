import java.util.*;
//Create class to find the sum of n natural numbers using while loop 
 public class SumOfNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//take the input
		
		System.out.print("Enter the number : ");
		//user will entered the number until prints to 0 using while loop
		int number  = sc.nextInt();
		//here we are storing for temporary
		int sumup = number ;
		//create a variable sum to store sum via formula
		int sum = 0;
		//solving sum via while,
		//first check the number is positive or not
		if(number > 0){
			while(sumup > 0){   //till the sumup(temp) variable is positive,and not zero
				sum += sumup;
				sumup--;
			}
		}
		int sumFormula = (number*(number+1))/2 ; //formula based
			
		System.out.print("The result from formula is "+sumFormula+" and from from while is "+ sum);
	}
 }
