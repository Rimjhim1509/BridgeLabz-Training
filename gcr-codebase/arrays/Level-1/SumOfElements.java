import java.util.*;
//Create class to print An abundant number is an integer in which the sum of all the divisors of the number
// is greater than the number itself.


 public class SumOfElements {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] age = new int[10];
		for(int i = 0 ; i< age.length ; i++){
			System.out.print("Enter the age" + (i+1) + ": ");
			age[i] = sc.nextInt();
		}
		for(int i = 0 ; i < age.length ; i++){
			
			if(age[i] > 0){
				if(age[i] >= 18){
					System.out.println("The student with the age"+age[i]+" can vote");
				}
				else{
					System.out.println("The student with the age"+age[i]+" cannot vote");
				}
			}
			else{
				System.out.println("Invalid age");
			}
		}
		
	}
}