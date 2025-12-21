import java.util.Scanner;

public class RemainderAndQuotient{
	public static int[] findRemainderAndQuotient(int number , int divisor){
		int[] result = new int[2];
		int quotient = number/divisor ;
		int remainder = number % divisor ; 
		result[0] = quotient;
		result[1] = remainder ;
		return result ; 
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int divisor = sc.nextInt();
		
		int[] remainder= findRemainderAndQuotient(number1 ,divisor);
		System.out.print(" the quotienrt and remainder is "+ remainder[0] + " and " + remainder[1]);
		
        sc.close();
    }
}
