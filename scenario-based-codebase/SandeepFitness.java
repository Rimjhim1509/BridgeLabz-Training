import java.util.*;
public class SandeepFitness{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] pushUpCount = new int[7];
		
		for(int i = 0 ; i< 7 ; i++){
			System.out.println("Enter the Push ups count on "+(i+1)+" : " );
			pushUpCount[i] =sc.nextInt();
		}
		int count = 0 ;
		int total = 0;
		for(int pushup : pushUpCount){
			 
			if(pushup == 0){
				continue;
			}
			total+=pushup;
			count++;
			
		}
		int avg = total/count ;
		System.out.println("Average Pushups : " + avg);
		System.out.println("total Pushups : " + total);
	}
}