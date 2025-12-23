import java.util.*;
public class IndexOutOfBound{
	
	
	public static void accessOutofBound(String text){
		//Call substring(start, end) where start > end
		System.out.println(text.substring(5, 2));
	}
	public static void handleException(String text) {
        try {
            System.out.println(text.substring(9, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught and handled.");
        }
		catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
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
