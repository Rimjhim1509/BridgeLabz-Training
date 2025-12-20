import java.util.Scanner;

public class CountHandshakes {
	public static int handshake(int numberOfStudents){
		return numberOfStudents *(numberOfStudents -1)/2 ;
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a students : ");
		int students = sc.nextInt();
		
		
		
		int handshakes = handshake(students);
		System.out.print(handshakes);
        sc.close();
    }
}
