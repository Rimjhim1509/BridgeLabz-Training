import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer : ");
		int number = sc.nextInt();
		
		int[] tableArr = new int[10];
		
		for(int i = 1; i<= tableArr.length ; i++){
			System.out.println(number + " * " + i + " = "+ number*i );
		}
	}
}