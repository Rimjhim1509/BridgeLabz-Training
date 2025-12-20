import java.util.Scanner;

public class SpringSeason {
	public static String springSeason(int month , int day){
		if((month == 3 && day <=31 && day >=20) || ((month >=4 || month <=5) && day >= 1 && day <=31) || (month == 6 && day>=1 && day<=20 )){
			return "Its a Spring";
		}
		
		else{
			return "Not a Spring Season";
			}
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month : ");
		int month = sc.nextInt();
		
		System.out.print("Enter a day : ");
		int day = sc.nextInt();
		
		
		String si = springSeason(month ,day);
		System.out.print(si);
        sc.close();
    }
}
