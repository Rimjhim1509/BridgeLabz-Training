import java.util.*;
public class Reminder {
	public static boolean isLeap(int year){
		return (year%400==0 || (year % 4 == 0 && year %100 != 0)) ;
	}
	public static int daysinMonth(int month , int year){
		switch(month){
			case 1: case 3 : case 5 : case 7: case 8 : case 10 : case 12 : return 31 ;
			case 4 : case 6 :case 9: case 11 : return 30 ;
			case 2 : return isLeap(year) ? 29 :28 ;
			default : return 0;
		}
	}
	public static int convertToDays(int day , int month , int year){
		int totalDays= year*365 ;
		for(int m =1 ; m < month ; m++){
			totalDays+=daysinMonth(m,year);
		}
		totalDays+=day;
		return totalDays;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		int totalFine = 0;
		for(int i =0 ;i < 5;i++ ){
			System.out.println("Book issued no. : "+(i+1));
			
			//Due date format (dd-mm-yyyy)
			System.out.println("Enter the due date (format should be dd-mm-yyyy): ");
			String dueDate = sc.next();
			String[] splitDueDate = dueDate.split("-");
			
			int dueDay = Integer.parseInt(splitDueDate[0]);
			int dueMonth = Integer.parseInt(splitDueDate[1]);
			int dueYear = Integer.parseInt(splitDueDate[2]);
			
			System.out.print("Enter the return date (format should be dd-mm-yyyy): ");
			String returnDate = sc.next();
			String[] returnPart = returnDate.split("-");
			
			int returnDay = Integer.parseInt(returnPart[0]);
			int returnMonth = Integer.parseInt(returnPart[1]);
			int returnYear = Integer.parseInt(returnPart[2]);
			
			int dueTotalDays = convertToDays(dueDay , dueMonth , dueYear);
			int returnTotalDays = convertToDays(returnDay,returnMonth,returnYear);
			if(returnTotalDays > dueTotalDays){
				int lateDay = returnTotalDays- dueTotalDays ;
				int fine = lateDay*5;
				totalFine+=fine ;
				System.out.println("Fine for days : "+ lateDay);
				System.out.println("Fine charge is : "+ fine);
			}
			else{
				System.out.println("Returned Book on Time .\nNO FINE...");
			}
			
		}
		System.out.print("Total fine charge is : "+totalFine);
	}
}