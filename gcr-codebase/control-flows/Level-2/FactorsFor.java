import java.util.*;
//Create class to print the factors of number.
public class FactorsFor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		// check positive or not
		if(number <= 0 ){
			System.out.print("Not a valid number");
		}
		//checking from 1 to n if any get divide and gives 0 its a factor
		for(int i =1 ; i < number ; i++){
			if(number % i == 0){
				System.out.println(i);
			}
		}
	}
}