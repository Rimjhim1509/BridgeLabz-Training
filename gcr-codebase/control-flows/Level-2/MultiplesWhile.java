import java.util.*;
//Create class to print the multiples through While loop
public class MultiplesWhile {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		//print	 the multiples through While
		if(number < 0 || number >= 100){
			System.out.print("Not a Valid number");
			return;
		}
		int counter = 99;
		while(counter > 1 ){
			if(counter % number == 0 	){
				System.out.println(counter);
				System.out.print("Hello");
				continue;
				System.out.print("hHII");
			}
			counter-- ;
		}
		
		
	}
}