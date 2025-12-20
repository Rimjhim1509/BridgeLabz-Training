import java.util.*;
public class Factors {
	public static void main(String[] args){
		//take input
		Scanner sc = new Scanner(System.in);
		//enter the value to print the table of any no. from 6 to 9
		int number = sc.nextInt();
		//define array to store result
		int maxFactor = 10;
		int[] maxArrFactor = new int[10] ;
		int index = 0 ;
		for(int i = 1 ; i < number ; i++){
			if( number % i == 0){
				
				if(index == maxFactor){
					maxFactor = maxFactor* 2;
					int[] temp = new int[maxFactor] ;
					for(int j = 0 ; j < maxArrFactor.length ; j++){
						temp[j] = maxArrFactor[j];
					}
					maxArrFactor = temp ;
				}
				maxArrFactor[index] = i ; 
				index++;
			}
			
		}
		for(int i = 0 ; i < maxArrFactor.length ; i++){
			System.out.print(maxArrFactor[i] + " " );
		}
		
		
	}
}