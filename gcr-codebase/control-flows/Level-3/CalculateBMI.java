import java.util.*;
//Create class to print Count Digit in given number.

public class CalculateBMI {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
		System.out.print("Enter the weight : ");
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		
		double heightInMeter = height/100.0;
		
		double bmiCalculate = weight/(heightInMeter*heightInMeter);
		if(bmiCalculate <= 18.4){
			System.out.print("Status : UnderWeight");
			
		}
		else if(bmiCalculate >= 18.4 && bmiCalculate<25.0){
			System.out.print("Status : Normal");
			
		}
		else if(bmiCalculate >=25.0 && bmiCalculate<40.0){
			System.out.print("Status : Overweight");
			
		}
		else {
			System.out.print("Status : Obese");
		}
	}
}