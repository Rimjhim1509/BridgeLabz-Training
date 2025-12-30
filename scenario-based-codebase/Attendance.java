

import java.util.*;
public class Attendance {
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
	String[] students = new String[10];
	int presenceCount = 0;
	int absenceCount = 0;
		for(int i = 0 ; i < 10 ; i++){
			System.out.print("Enter the name of Student " + (i+1) + " : ");
			students[i] = sc.nextLine();
			
		}
		for(String names: students){
			System.out.print("Is "+ names+ " present or absent ");
			String status = sc.next();
			status = status.toLowerCase();
			switch(status){
				case "present":
					presenceCount++;
				break;	
				case "absent" :	
					absenceCount++;
				break;
				
			}
			
		}
		System.out.print("Total present students : "+ presenceCount);
		System.out.print("Total present students : "+ absenceCount);
		
	}
}