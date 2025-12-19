import java.util.*;
//Create class to print the Calculator.


 public class Calculator {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
		System.out.print("Enter the first integer : ");
		int first = sc.nextInt();
		System.out.print("Enter the second integer : ");
		int second = sc.nextInt();
		System.out.print("Enter a operator :  ");
		String op = sc.next();
		
		switch(op){
			case "+":
			System.out.print(first + second);
			break;
			case "-":
			System.out.print(first - second);
			break;
			case "*":
			System.out.print(first * second);
			break;
			case "/":
			System.out.print(first / second);
			break;
			default:
			System.out.print("Invalid input");
		}
		
	}
}