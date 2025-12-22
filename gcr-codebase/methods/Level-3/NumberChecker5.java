import java.util.*;
public class NumberChecker5{
	public static boolean isPrime(int number){
		for(int i =2 ; i< number/2 ; i++){
			if(number% i == 0){
				return false;
			}
		}
		return true ;
	}
	public static boolean isNeon(int number){
		int square = number*number;
		int sum =0;
		while(number != 0){
			sum = square %10;
			square/=10;
		}
		
		return sum ==number;
	}
	public static boolean isSpy(int number){
		int sum = 0;
		int product = 1 ;
		while(number != 0){
			sum+=number%10 ;
			product*=number%10 ;
			number/=10;
		}
		return sum ==product;
	}
	public static boolean isAutomorphic(int number){
		int temp = number;
		int squares = number*number ;
		while(temp != 0){
			if(temp % 10 != squares%10){
				return false ;
			}
			temp/=10 ;
			squares/=10 ;
		}
		return true ;
	}
	public static boolean isBuzz(int number){
		int numEnd = number% 10;
		if(number % 7==0 || numEnd==7){
			return true;
		}
		return false;
	}
	
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.println("Prime Number: " + NumberChecker5.isPrime(number));
		System.out.println("Neon Number: " + NumberChecker5.isNeon(number));
		System.out.println("Spy Number: " + NumberChecker5.isSpy(number));
		System.out.println("Automorphic Number: " + NumberChecker5.isAutomorphic(number));
		System.out.println("Buzz Number: " + NumberChecker5.isBuzz(number));

    }
}
