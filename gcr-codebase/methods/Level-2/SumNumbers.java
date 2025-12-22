import java.util.Scanner;

public class SumNumbers {
	public static  int recursiveSum(int number){
		if(number == 1){
			return 1;
		}
		return number + recursiveSum(number -1);
	}
	public static int sumNum(int number){
		return number*(number+1)/2;
	}
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		int number = sc.nextInt();
		int sumFormula = sumNum(number);
		int sumRecursion = recursiveSum(number);

		System.out.print("The formula Sum is  "+sumFormula+"  and through recursion is  " + sumRecursion);
        sc.close();
    }
}
 