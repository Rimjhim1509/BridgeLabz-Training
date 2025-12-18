import java.util.*;
//Create class to print the factors of number.
public class FactorsWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		// check positive or not
		if(number <= 0 ){
			System.out.print("Not a valid number");
		}
		//checking from 1 to n if any get divide and gives 0 its a factor
		int counter = 1 ;
		while(counter <= number){
			if(number % counter == 0){
				System.out.println(i);
			}
			i++;
		}
	}
}