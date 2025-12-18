import java.util.*;
//Create class to  count down the number for Rocket Launch bu using For loop
public class CountDownFor {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in) ;
		//take the input
		System.out.print("Enter the counter : ");
		int counter  = sc.nextInt();
		for(int i = counter ; i>=1;i-- ){
			System.out.println(i);
		}
		
	}
}