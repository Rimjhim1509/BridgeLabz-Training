import java.util.*;
public class YoungestTallest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//take the input of each age and height og
		//Amar's Age and Height
		System.out.println("Enter the age of Amar : ");
		int amarAge = sc.nextInt();
		System.out.println("Enter the height of Amar : ");
		int amarHeight = sc.nextInt();
		
		// Akbar's Age and Height
		System.out.println("Enter the age of Akbar : ");
		int akbarAge = sc.nextInt();
		System.out.println("Enter the height of Akbar : ");
		int akbarHeight = sc.nextInt();
		
		//Anthony Age and Height
		System.out.println("Enter the age of Anthony : ");
		int anthonyAge = sc.nextInt();
		System.out.println("Enter the height of Anthony : ");
		int anthonyHeight = sc.nextInt();
		
		//Here <= and >= handle the tle cases where two are same and we get only one then,
		//logic :: 
		if(amarAge <= akbarAge && amarAge <= anthonyAge){
			System.out.println("The youngest friend is Amar");
		}
		else if(akbarAge <= amarAge && akbarAge <= anthonyAge){
			System.out.println("The youngest friend is Akbar");	
		}
		else{
			System.out.println("The youngest friend is Anthony");	
		}
		
		if(amarHeight >= akbarHeight && amarHeight >= anthonyHeight){
			System.out.println("The tallest friend is Amar");
		}
		else if(akbarHeight >= amarHeight && akbarHeight >= anthonyHeight){
			System.out.println("The tallest friend is Akbar");	
		}
		else{
			System.out.println("The tallest friend is Anthony");	
		}
	}
}