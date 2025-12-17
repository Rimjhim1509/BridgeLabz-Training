//Create a class to find the Average marks of Sam of Physics , Maths , Chemistry

public class AverageMarks {
	public static void main(String[] args){
		
		//Create a variable math_percent, chem_percent, physics_percent for percent of Math , Chemistry , Physics respectively.
		int math_percent = 94
		 ,chem_percent = 95
		 ,physics_percent= 96;
		
		//Create a variable average to calculate the average of all three subjects.
		int average = (math_percent + chem_percent + physics_percent)/3 ;
		
		//Print the average of Sam's percent marks.
		System.out.print("Sam's average mark in PCM is "+average);
	}
}