import java.util.*;
public class Fibonacci{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		printFibonacci(n);
		 
	}
	public static void printFibonacci(int n){
		int a =0,b =1 ;
		if(n>=1)System.out.print(b + " ");
		if(n >=2) System.out.print(a + " ");
		for(int i = 3 ; i<= n ; i++){
			int c= a+b ;
			System.out.print(c + " ");
			a=b;
			b=c ;
		}
		
	}
}