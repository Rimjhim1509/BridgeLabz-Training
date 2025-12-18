import java.util.*;
//Create class CheckNumbers to check the number is positive , negative , zero
public class CheckNumbers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in) ;
		//take the input
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		//Apply conditions to check the number is positive , negative , zero
		if(number== 0){
			System.out.println("zero");
		}
		else if(number > 0){
			System.out.println("positive");
		}else{
			System.out.println("negative");
		}
		
	}
}