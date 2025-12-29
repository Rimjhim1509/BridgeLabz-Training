import java.util.*;
public class NumberGuess {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random fixednum = new Random();
		int fixednumber = fixednum.nextInt(100) + 1;
		int number ;
		int attempt = 0;
		int maxAttempt = 5 ;
		System.out.println("Enter a number 1 to 100:  ");
		do{
			number = sc.nextInt();
			attempt++;
			if(number > fixednumber){
				System.out.println("Number is too high  ");
			}
			else if(number < fixednumber){
				System.out.println("Number is too low  ");
			}
			else{
				System.out.println("Correct guess..!!  ");
				break;
			}
			
		} while(attempt < maxAttempt);
		if(number != fixednumber){
			System.out.println("Maximum Attempt reached  " + fixednumber);
		}
			
		
		
	}
	
		 
}
	