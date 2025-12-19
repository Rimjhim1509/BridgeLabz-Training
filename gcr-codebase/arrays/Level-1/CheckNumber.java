import java.util.*;
//Create class to print the array of 5 elements and check positive 


 public class CheckNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[5];
		for(int i = 0 ; i< numbers.length ; i++){
			System.out.print("Enter the integers" + (i+1) + ": ");
			numbers[i] = sc.nextInt();
		}
		for(int i = 0 ; i < numbers.length ; i++){
			
			if(numbers[i] > 0){
				if(numbers[i] %2 == 0){
					System.out.println("The element is "+ numbers[i]+ " even and positive");
				}
				else{
					System.out.println("The element is "+ numbers[i]+ " odd and positive");
				}
			}
			else if(numbers[i] < 0 ){
				System.out.println("The element is"+ numbers[i] +" negative");
			}
			
			else{
				System.out.println("The element is "+ numbers[i] +  " zero");
			}
	}
	if(numbers[0] > numbers[numbers.length -1]){
				System.out.println("The first element is greater");
			}
			else if(numbers[0] == numbers[numbers.length -1] ){
				System.out.println("The first element and last element are equal");
			}
			else{
				System.out.println("The last element is greater");
			}
  }
}