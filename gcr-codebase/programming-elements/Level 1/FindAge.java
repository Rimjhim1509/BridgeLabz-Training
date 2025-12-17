//Create Class FindAge to compute the Age of Harry

public class FindAge {
	
	public static void main(String[] args){
		
		//Create variable birthyear for the year of Birth and 
		// curryear to represent current year 
		int birthyear = 2000 , curryear = 2024;
		
		//Create variable age, represents Age in current year
		
		int age = curryear - birthyear ;
		
		//Print the Current age of the Harry
		System.out.print("Harry's Age in 2024 : " + age);
	}
}