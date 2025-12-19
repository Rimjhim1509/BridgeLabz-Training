import java.util.*;
//Create class to print Armstrong Number
public class ArmstrongNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
		System.out.print("Enter the integer : ");
		int number = sc.nextInt();
		int sum = 0;
		int originalNumber = number;
		
		while(originalNumber != 0){
		int remainder  = originalNumber % 10;
		sum += remainder*remainder*remainder;
		originalNumber = originalNumber /10;
		}
		if(sum == number){
			System.out.print("It is a armstrong number.");
		}
		else{
			System.out.print("It is not a armstrong number.");
		}
		
		
	}
}