import java.util.*;
public class SimpleInterest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a principal : ");
		
		int p = sc.nextInt();
		
		System.out.print("Enter a rate of Interest : ");
		
		int r = sc.nextInt();
		
		System.out.print("Enter a Period : ");
		
		int t = sc.nextInt();
		
		int SimpleInterest = (p * r * t ) /100;
		
		System.out.print("Simple Interest of given amount is : "+SimpleInterest);
		
	}
}
