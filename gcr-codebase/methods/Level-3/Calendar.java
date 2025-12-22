import java.util.*;
public class Calendar{
	public static boolean isLeapYear(int year){
		if((year %4 == 0 &&  year %100 !=0)|| year %400 ==0){
			return true ;
		}
		return false;
	}
	public static String getMonth(int month){
		String[] months = {"January", "February", "March", "April","May", "June", "July", "August", "September", "October", "November", "December"};
		return months[month-1];
	}
	public static int getdays(int month , int year){
		int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
	}
	public static int getFirstDay(int month, int year) {
    int y = year - (14 - month) / 12;
    int m = month + 12 * ((14 - month) / 12) - 2;
    int d = (1 + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
    return d;
	}
	public static void displaycalendar(int month ,int year){
		int startDay = getFirstDay(month , year);
		System.out.print("Sun Mon Tue Wed Thu Fri Sat");
		for (int i = 0; i < startDay; i++) {
        System.out.print("    ");
		}
		int daysInMonth = getdays(month,year);
		for (int day = 1; day <= daysInMonth; day++) {

        
        System.out.printf("%3d ", day);

    
        if ((day + startDay) % 7 == 0) {
            System.out.println();
        }
    }
	
		
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int year = sc.nextInt();
		
	}
}