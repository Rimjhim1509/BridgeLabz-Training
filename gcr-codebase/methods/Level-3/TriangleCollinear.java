import java.util.*;
public class TriangleCollinear{
	public static boolean checkcollinear(int x1,int x2,int x3,int y1,int y2,int y3){
		
		return (y2 - y1) * (x3 - x2) ==
               (y3 - y2) * (x2 - x1);
	}
	public static boolean checkcollinearArea(int x1,int x2,int x3,int y1,int y2,int y3){
		double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		return area==0 ;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		int y3 = sc.nextInt();
		boolean collinear  = checkcollinear(x1,x2,x3,y1,y2,y3);
		boolean collinearArea = checkcollinearArea(x1,x2,x3,y1,y2,y3);
		System.out.print("The point through collinear " + collinear + " and through Area is " + collinearArea );
	}
}