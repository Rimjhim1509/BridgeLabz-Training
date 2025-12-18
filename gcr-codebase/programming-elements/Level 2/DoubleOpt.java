import java.util.*;
//Create class  to DoubleOpt check the operation precedence

public class DoubleOpt {
	public static void main(String[] args){
		//Create Scanner object
		Scanner sc = new Scanner(System.in);
		//Create the variable a, b, c to take the input 
		System.out.print("Enter the first value ");
		double a  =  sc.nextDouble();
		System.out.print("Enter the second value ");

		double b = sc.nextDouble();
		System.out.print("Enter the third value ");

		double c = sc.nextDouble();
		//Create the variable to check the operations
		double d = a + b *c;
		double e = a*b+c;
		double f = c + b/c;
		double g = a% b + c;
		//Print the output
		System.out.print("The results of Operations are "+ a + " " + b+ " "+ c +" " + d );
	}
}