import java.util.*;
public class MultiplesFor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number <=0 || number >= 100){
			System.out.print("Not a positive number");
			return;
		}
		for(int i = 100 ; i>=1 ; i--){
			//check each i that is it a multiple of number
			if(i % number == 0){
				System.out.println(i);
				continue;
			}
			
		}
	}
}