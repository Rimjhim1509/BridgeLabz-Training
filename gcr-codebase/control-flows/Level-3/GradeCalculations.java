import java.util.*;
//Create a class to calculate grade
public class GradeCalculations{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of physics : ");
		int physics  = sc.nextInt();
		
		System.out.print("Enter the marks of chemistry : ");
		int chemistry  = sc.nextInt();
		
		System.out.print("Enter the marks of maths : ");
		int maths  = sc.nextInt();
		
		int percentage = (physics + maths + chemistry)/3;
		//codition to check Grade
		if(percentage >= 80){
			System.out.print("The Average marks is "+ percentage+" and gets Grade A " + " and Level 4 above-agency normalized students.");
		}
		else if(percentage >= 70 && percentage <80){
			System.out.print("The Average marks is "+ percentage+" and gets Grade B " + " and Level 3 at agency normalized students.");
		}
		else if(percentage >= 60 && percentage <70){
			System.out.print("The Average marks is "+ percentage+" and gets Grade C " + " and Level 2 below, but approaching-agency normalized students.");
		}
		else if(percentage >= 50 && percentage <60){
			System.out.print("The Average marks is "+ percentage+" and gets Grade D " + " and Level 1 well below-agency normalized students.");
		}
		else if(percentage >= 40 && percentage <50){
			System.out.print("The Average marks is "+ percentage+" and gets Grade E " + " and Level 1 too below agency normalized students.");
		}
		else {
			System.out.print("The Average marks is "+ percentage+" and gets Grade R " + "Remidial Standards");
		}
		
		
	}
}