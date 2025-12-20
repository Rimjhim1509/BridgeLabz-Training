import java.util.Scanner;

public class CheckPositive {
	public static int checkpos(int number){
		if(number > 0){
			return 1;
		}
		else if(number< 0){
			return -1;
		}
		else{
			return 0;
		}
		
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer value : ");
		int number = sc.nextInt();
		
		
		int si = checkpos( number);
		System.out.print(si);
        sc.close();
    }
}
