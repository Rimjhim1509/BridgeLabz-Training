import java.util.Scanner;

public class LargestSmallest {
	public static String largestSmallest(int number1){
		if(num1 > num2 && num1 > num3){
			return "largest is first number" ;
		}
		else if(num2 > num1 && num3 > num2){
			return "second largest is second number.";
		}
		else {
			return " Third is largest number ."
		}
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first number");
		int num1 = sc.nextInt();
		
		System.out.print("Enter a second number");
		int num2 = sc.nextInt();
		
		System.out.print("Enter a third number");
		int num3 = sc.nextInt();
		
		
		System.out.print(si);
        sc.close();
    }
}
