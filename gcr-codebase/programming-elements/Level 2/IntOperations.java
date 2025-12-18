import java.util.*;
//Create class IntOperations to check the operation precedence

public class IntOperations{
	public static void main(String[] args){
		//Create Scanner object
		Scanner sc = new Scanner(System.in);
		//Create the variable a, b, c to take the input 
		System.out.print("Enter the first value ");
		int a  =  sc.nextInt();
		System.out.print("Enter the second value ");

		int b = sc.nextInt();
		System.out.print("Enter the third value ");

		int c = sc.nextInt();
		//Create the variable to check the operations
		int d = a + b *c;
		int e = a*b+c;
		int f = c + b/c;
		int g = a% b + c;
		//Print the output
		System.out.print("The results of Operations are "+ a + " " + b+ " "+ c +" " + d );
	}
}