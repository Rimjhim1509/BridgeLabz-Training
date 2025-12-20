import java.util.*;
public class Employeebonus {
	public static void main(String[] args){
		//take input
		Scanner sc = new Scanner(System.in);
		int n =10; //10 employees
		double[] salary = new double[n];
		double[] years = new double[n];
		double[] bonus = new double[n];
		double[] newSalary = new double[n];
		
		double totalBonus = 0.0 ;
		double totalOldSalary = 0.0 ;
		double totalNewSalary = 0.0 ;
		
		for(int i = 0 ; i< n ; i++){
			System.out.println("Enter a salary : ");
			double sal = sc.nextDouble();
			System.out.println("Enter a year : ");
			double yr = sc.nextDouble();
			
			if(sal <0 || yr<0){
				System.out.println("Print clear salary or year");
				i--;
			}
			salary[i] = sal;
			years[i] = yr;
		}
		for(int i = 0 ; i <n ; i++){
			if(years[i] > 5){
				bonus[i] = 0.05 *salary[i];
			}
			else{
				bonus[i] = 0.02 *salary[i];
			}
			newSalary[i] = bonus[i] + salary[i];
			totalBonus = bonus[i];
			totalOldSalary = salary[i];
			totalNewSalary = salary[i] ;
		}
		System.out.print("TotalBonus = "+ totalBonus);
		System.out.print("totalOldSalary = "+ totalOldSalary);
		System.out.print("totalNewSalary = "+ totalNewSalary);
		
		
	}
	
}