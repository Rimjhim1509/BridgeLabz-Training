import java.util.*;
// Create class Fizzbuzz to Take the user input number, check for a positive integer
//and print the number, but for multiples of 3 print "Fizz" instead of the number,
// for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
public class Fizzbuzz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Take input
		int number = sc.nextInt();
		//check positive Natural
		if(number <= 0){
			System.out.print("Not a valid number");
			return;
		}
		//condition for positive
		//conditional order matters
		for(int i = 1 ; i <= number ; i++){
			if(i % 3 ==0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}
			else if(i % 5 == 0){
				System.out.println("Buzz");
			}
			else if(i % 3 ==0){
				System.out.println("Fizz");
			}
			else{
				System.out.println(i);
			}
		}
	}
}