import java.util.*;
//Create a class to find if first is the smallest
public class SmallestNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Create the variable number1,number2, number3 to take the input 
		System.out.print("Enter the first value ");
		int number1  =  sc.nextInt();
		System.out.print("Enter the second value ");

		int number2 = sc.nextInt();
		System.out.print("Enter the third value ");

		int number3 = sc.nextInt();
		
		if(number1 < number2 && number1 < number3){
			System.out.print("Is the first number the smallest? Yes");
		}else{
			System.out.print("Is the first number the smallest? No");

		}
	}
}
