import java.util.*;
//Create class EmployeeBonus to check employee's working  year and distribute bonus
public class EmployeeBonus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
		System.out.print("Enter the month : ");
		int year  =sc.nextInt();
		
		System.out.print("Enter the salary  : ");
		int salary  = sc.nextInt();
		//Check and print whether employee deserve bonus or not
		if(year > 5){
			double salaryBonus = salary * 0.05 ;
			System.out.print("the bonus amount is "+salaryBonus );
		}
		else{
			System.out.print("No bonus amount is " );
		}
			
	}
}