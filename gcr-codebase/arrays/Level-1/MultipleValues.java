import java.util.*;
public class MultipleValues {
	public static void main(String[] args){
		//take input
		Scanner sc = new Scanner(System.in);
		//define variable and array with size = 10
		double[] values = new double[10];
		double total = 0.0;
		//start iteration with 0
		int i =0 ;
		//loop run always 
		while(true){
			System.out.print("Enter the integer : ");
			//this define to intake with user
			double number  = sc.nextDouble();
			//break here
			if(number <=0 || i == 10){
				break;
			}
			//assign for each ith value starting with 0,
			values[i] = number ;
			i+=1;

		}
		//run a loop to calculate all the values[i] value
		for(int p = 0;p <i; p++){
			total+=values[p];
		}
		
		System.out.println("total is " + total);
	}
}