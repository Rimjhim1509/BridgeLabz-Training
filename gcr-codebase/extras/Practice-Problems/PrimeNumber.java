import java.util.*;
public class PrimrNumber{
	public static void main(String[] args){
		Scanner sc  = new  Scanner(System.in);
		int number = sc.nextInt();
		boolean isResult = isPrime(number);
		if(isResult){
			System.out.print("Prime no.");
		}
		else{
			System.out.print("not a prime no.");
		}
		 
	}
	public static boolean isPrime(int number){
		for(int i = 2 ; i< number ;i++){
			if(number % i ==0){
				return false ;
			}
		}
		
		return true;
	}
}