import java.util.*;
//Create class to Predict Days


 public class PredictDay {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//take input
	//	System.out.print("Enter the month : ");
		int m = Integer.parseInt(args[0]);
		
		//System.out.print("Enter the day : ");
		int d = Integer.parseInt(args[1]);
		
		//System.out.print("Enter the year : ");
		int y = Integer.parseInt(args[2]);
		
		int yo = y - (14-m)/12;
		int x = y + yo/4 - yo/100 + yo/400 ;
		int mo=m+12*((14-m)/12)-2;
		int d1 = (d+x+31*mo/12)*7;
		
		System.out.print(d1);
	}
}