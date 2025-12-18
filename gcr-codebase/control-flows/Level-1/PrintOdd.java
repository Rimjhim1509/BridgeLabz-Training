import java.util.*;
public class PrintOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the integer : ");
		int number = sc.nextInt();
		
		if(number <= 0){
			System.out.print("Not a positive number");
		}
		for(int i = 1 ; i <= number ; i++){
			if(i % 2 ==0){
				System.out.println("the number " + i + " is even." );
			}
			else{
				System.out.println("the number " + i + " is odd." );
			}
			
		}
		
	}
}