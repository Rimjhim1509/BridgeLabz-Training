import java.util.*;

public class Volume_of_Cylinder {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of a cylinder : ");
		double radius = sc.nextInt();
		System.out.print("Enter height of a cylinder: ");
		double height =sc.nextInt();
		double VolumeOfCylinder = 3.14 * height * radius * radius ;
		System.out.println("Volume of cylinder is : "+ VolumeOfCylinder);
		
	}
}	