import java.util.*;

public class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of the rectangle : ");
		int  length = sc.nextInt();
		System.out.print("Enter breadth of the rectangle : ");
		int  breadth = sc.nextInt();
		
		int area = 2*(length + breadth);
		
		System.out.print("Area of rectangle: " + area);
	}
}