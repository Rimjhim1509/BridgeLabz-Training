import java.util.*;
//Create class to print An abundant number is an integer in which the sum of all the divisors of the number
// is greater than the number itself.


 public class AbundantNum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
		System.out.print("Enter the integer : ");
		int number = sc.nextInt();
		if(number <= 0){
			System.out.print("Please enter a valid number");
			return;
		}
		int sum = 0;
		for(int i = 1; i < number; i++){
			if(number % i == 0){
				sum+=i;
			}
		}
		if(sum > number){
			System.out.print("Abundant Number.");
		}
		else{
			System.out.print("Not a Abundant Number.");
		}
	}
}