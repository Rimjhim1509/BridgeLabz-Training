import java.util.*;
//Create class to print Prime Number
public class PrimeNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
		System.out.print("Enter the integer : ");
		int number = sc.nextInt();
		
		if(number < 1){
			System.out.print("Give valid input");
			return;
		}
		
		for(int i = 2 ; i < number ; i++){
			if(number % i == 0){
				System.out.println("It is not a prime number");
				return ;
			}
			
		}
		System.out.print("It is a prime number");
		
		
	}
}