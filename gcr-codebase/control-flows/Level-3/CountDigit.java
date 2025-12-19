import java.util.*;
//Create class to print Count Digit in given number.

public class CountDigit {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
		System.out.print("Enter the integer : ");
		int number = sc.nextInt();
		int count = 0;
		
		//FOR method
		for(; number !=0 ; number/=10){
			count++;
		}
		//While Method
		//while(number > 0){
		//	int remainder = number % 10 ;
		//	count ++ ;
		//	number = number /10;
		//}
		System.out.print("Count is " + count);
		
		
	}
}