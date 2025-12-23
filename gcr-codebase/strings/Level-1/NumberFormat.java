import java.util.*;
public class NumberFormat{
	
	
	public static void accessOutofBound(String text){
		int number = Integer.parseInt(text) ;
		System.out.println("Number is: " + number);
		
	}
	public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text) ;
			System.out.println("Number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught and handled.");
        }
    }
	public static void main(String[] args){
		//Take a String input from the user using Scanner.

		 Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.next();
		//accessOutofBound(text);
		handleException(text);

	}
}
