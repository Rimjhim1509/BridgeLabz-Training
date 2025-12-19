import java.util.*;
//Create  class PowersWhile to find Powers using while
public class PowersWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		
		System.out.print("Enter a power : ");
		int power= sc.nextInt();
		
		int result = 1 ;
		//Check positive or not
		if(number <=0){
			System.out.print("Not a positive number");
			return;
		}
		int counter = 0;
		//Check from 1 to power  till print the power of a number.
		while(counter < power){
			result = result * number;
			counter++;
		}
		System.out.print(result);
	}
}