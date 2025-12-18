import java.util.*;
//Create the class SpringSeason that takes two int values month and day to predict the Spring Season
public class SpringSeason {
	public static void main(String[] args){
		//Take the input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month : ");
		int month = sc.nextInt();
		System.out.print("Enter the day : ");
		int day = sc.nextInt();
		// Checking if month is 3 then day should in between 20-31 ,
		//if month is 4 then day should in between 1-20
		if((month == 3 && day >= 20 && day <=31)||(month ==4 && day >= 1 && day <= 20) ) {
			System.out.print("It's a Spring Season.");
		}
		else{
			System.out.print("Not a Spring Season");
		}
		
	}
}