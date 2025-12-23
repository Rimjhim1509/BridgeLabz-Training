import java.util.*;

public class Nullpointer {
	public static void generateException(){
		String s = null;
		System.out.println("the length is "+ s.length());
	}
	public static void handleException(){
		String text =null;
		
		try{
			System.out.println("the length is "+ text.length());
		}
		catch(NullPointerException e){
			System.out.print("NullPointerException handles");
		}
		
	}

    // Main method to demonstrate
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		handleException();
		//generateException();
       
    }
}
