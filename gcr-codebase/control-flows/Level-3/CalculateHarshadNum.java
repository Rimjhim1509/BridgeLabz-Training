import java.util.*;
//Create class to print A Harshad number, is an integer which is divisible by the sum of its digits. 


public class CalculateHarshadNum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
		System.out.print("Enter the integer : ");
		int number = sc.nextInt();
		int sum = 0;
		while(number > 0){
			int remain = number%10;
			sum += remain;
			number = number/10;
		}
		if(number % sum == 0){
			System.out.print("Harshad Number");
			
		} 
		else{
			System.out.print("Not a Harshad Number");
		}
		
		
	}
}