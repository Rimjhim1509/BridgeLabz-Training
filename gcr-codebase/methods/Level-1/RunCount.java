import java.util.Scanner;

public class RunCount {
	public static int runcount(int side1 , int side2 , int side3){
		return 5000/(side1+side2+side3);
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a side1 : ");
		int side1 = sc.nextInt();
		
		System.out.print("Enter a side2 : ");
		int side2 = sc.nextInt();
		
		System.out.print("Enter a side3 : ");
		int side3 = sc.nextInt();
		int si = runcount(side1 , side2, side3);
		System.out.print(si);
        sc.close();
    }
}
