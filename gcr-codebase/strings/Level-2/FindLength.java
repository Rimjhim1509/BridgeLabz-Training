import java.util.*;
public class FindLength {
	public static int findLength(String text){
		int count =0 ;
		try{
			while(true){
				text.charAt(count);
				count++;
			}
		}catch(StringIndexOutOfBoundsException e){
			return count++;
			
		}
	}
	public static void main(String[] args){
		 // Take input using next()
		 Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        // User-defined method
        int manualLength = findLength(input);

        // Built-in method
        int builtinLength = input.length();

        System.out.println("Length without using length(): " + manualLength);
        System.out.println("Length using length(): " + builtinLength);
	}
}