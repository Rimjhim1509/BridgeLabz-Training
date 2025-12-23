import java.util.*;
public class OutOfBoundArray{
	
	public static void accessOutofBound(String[] names){
		System.out.println(names[names.length]);
		
	}
	public static void handleException(String[] names) {
        try {
            
			System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("ArrayIndexOutOfBoundsException  caught and handled.");
        }
		catch (RuntimeException  e) {
            System.out.println("RuntimeException caught and handled.");
        }
    }
	public static void main(String[] args){
		//Take a String input from the user using Scanner.

		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number of names: ");
         int n = sc.nextInt();
		 sc.nextLine();
		 String[] names = new String[n];
		 for(int i = 0 ; i < n ; i++){
			 System.out.print("Enter name " + (i + 1) + ": ");
			 names[i] = sc.next();
		 }
		//accessOutofBound(text);
		handleException(names);

	}
}
