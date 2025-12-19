import java.util.*;
//Create class to print the greatest  factors of number.
public class GreatestFactorFor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int greatestFactor = 1;
		// checking all the number except itself
		for(int i = number-1 ; i >=1; i--){
			if(number % i == 0){
				greatestFactor = i;
				break; //to stop as it finds.
			}
		}
		System.out.print(greatestFactor);
	}
}
