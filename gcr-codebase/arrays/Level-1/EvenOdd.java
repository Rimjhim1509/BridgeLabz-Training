import java.util.*;
public class EvenOdd {
	public static void main(String[] args){
		//take input
		Scanner sc = new Scanner(System.in);
		//enter the value to print the table of any no. from 6 to 9
		int number = sc.nextInt();
		//define array to store result
		if(number < 1){
			System.out.print("Error");
			return;
		}
		int size = number/2 +1;
		int[] even = new int[size];
		int[] odd = new int[size];
		
		int evenIndex = 0;
		int oddIndex = 0 ;
		
		for(int i = 1; i< number ; i++){
			if(i % 2 == 0){
				even[evenIndex] = i ;
				
				evenIndex++;
			}
			else{
				odd[oddIndex] = i ;
				
				oddIndex++ ;
			}
		}
		for(int i = 0 ; i<evenIndex ; i++){
			System.out.println("Even " + even[i]);
			
		}
		for(int i = 0 ; i< oddIndex ; i++){
			System.out.println("Odd" + odd[i]);
		}
		
	}
}