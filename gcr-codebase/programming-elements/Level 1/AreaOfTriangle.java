import java.util.*;
//Create the class takes the base and height to find area of a triangle in square inches and square centimeters 

public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base of triangle: ");
		int base = sc.nextInt();
		System.out.print("Enter the height of triangle: ");
		int height = sc.nextInt();
		
		double area = (base * height)/2.0 ;
		double area_inch = area*0.155;
		
		System.out.print("Area of triangle is : " + area + "square cm"+ " and in inch is "+ area_inch + "square inch");
	}
}