import java.util.*;
//Create class to print the greatest  factors of number.
public class GreatestFactorWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int greatestFactor = 1;
		// checking all the number except itself
		int counter = number -1;
		while(counter >= 1){
			if(number % counter == 0 ){
				greatestFactor  = counter ;
				break ;
			}
			counter-- ;
		}
		System.out.print(greatestFactor);
	}
}
