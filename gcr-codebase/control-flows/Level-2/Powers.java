import java.util.*;
//Create a class Powers to find  power of a number.
public class Powers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		
		System.out.print("Enter a power : ");
		int power= sc.nextInt();
		int result = 1 ;
		//Check positive or not
		if(number <=0){
			System.out.print("Not a positive number");
			return;
		}
		//Check from 1 to power  till print the power of a number.
		for(int i = 1 ; i<= power ; i++){
			//check each i that is it a multiple of number
			result = result * number ;
			
			
		}
		System.out.print(result);
	}
}