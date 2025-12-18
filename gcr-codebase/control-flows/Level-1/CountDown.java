import java.util.*;
//Create class to  count down the number for Rocket Launch
public class CountDown {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in) ;
		//take the input
		System.out.print("Enter the number : ");
		int counter  = sc.nextInt();
		while(counter!=1){
			System.out.println(counter);
			counter-=1;
		}
		
	}
}