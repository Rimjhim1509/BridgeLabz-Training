import java.util.Scanner;

public class SumAllNumber {
	public static int sumNumber(int number){
		return (number*(number + 1))/2;
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
		int number = sc.nextInt();
		
		
		int si = sumNumber(number);
		System.out.print(si);
        sc.close();
    }
}
