import java.util.*;
//Create class to print the multiplication of 6-9
public class Multiplication {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		//number should be greater than 6 and smaller than 9
		if(number >= 6 && number<= 9){
			//using for loop 1 to 10
			for(int i = 1 ; i <= 10 ;i++){
				int temp = number*i;
				//Print table
				System.out.println(number + " * "+ i+ " = "+temp );
			}
		}
		
	}
}