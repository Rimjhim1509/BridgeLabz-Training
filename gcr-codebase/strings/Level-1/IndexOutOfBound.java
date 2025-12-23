import java.util.*;
public class IndexOutOfBound{
	
	//Write a Method to generate the Exception. Access the index using charAt()
	//beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
	public static void accessOutofBound(String text){
		System.out.println(text.charAt(text.length()));
	}
	public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught and handled.");
        }
    }
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.next();
		//accessOutofBound(text);
		handleException(text);

	}
}