import java.util.*;
public class MultiplySixToNine {
	public static void main(String[] args){
		//take input
		Scanner sc = new Scanner(System.in);
		//enter the value to print the table of any no. from 6 to 9
		int number = sc.nextInt();
		//define array to store result
		int[] multiplicationResult = new int[10];
		//check the edge cases
		if(number>=6 && number<= 9){
			//run a loop to store the result of multiplicationResult
			for(int i = 1 ; i < multiplicationResult.length ; i++){
				multiplicationResult[i] = number*i;
			}
			//run a loop to print the result
			for(int i = 1; i < multiplicationResult.length ; i++){
				System.out.println(number + " * " + i + " = " + multiplicationResult[i] );
			}
		}
		else{
			System.out.print("Not a valid input");
		}
	}
}