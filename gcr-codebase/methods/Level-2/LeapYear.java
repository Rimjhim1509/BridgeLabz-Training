import java.util.Scanner;

public class LeapYear {
	public static boolean findLeapYear(int year){
		if((year % 4==0 && year %100 !=0 ) || year %400 ==0){
			return true ;
		}
		return false ; 
	}
	//Method to find Sum of factors 
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the year : ");
		int year = sc.nextInt();
		if (year < 1582) {
            System.out.println("Leap year calculation is valid only for year >= 1582.");
        } else if (findLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
        sc.close();
    }
}
 