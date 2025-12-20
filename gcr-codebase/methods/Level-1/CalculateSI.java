import java.util.Scanner;

public class CalculateSI {
	public static double calculateSI(double principal , double rate , double time){
		return principal*rate*time/100 ;
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a principal value : ");
		double principal = sc.nextDouble();
		
		System.out.print("Enter a rate value : ");
		double rate = sc.nextDouble();
		
		System.out.print("Enter a time : ");
		double time = sc.nextDouble();
		double si = calculateSI(principal , rate, time);
		System.out.print(si);
        sc.close();
    }
}
