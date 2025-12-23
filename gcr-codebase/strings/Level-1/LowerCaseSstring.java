import java.util.*;
public class UpperCaseString{
	
	public static String toUpperCaseManual(String n){
		String upperText = "";
		for(int i = 0 ; i< n.length() ; i++){
			char ch  =n.charAt(i);
			if(ch >= 'A'  && ch <='Z'){
				upperText +=(char)(ch+32);
			}else{
				upperText +=ch;
			}
		}
		return upperText;
	}
	
	public static boolean compareStrings(String n1 , String n2) {
        if(n1.length() != n2.length()){
			return false ;
			
		}
		for(int i = 0 ; i< n1.length()-1 ; i++){
			if(n1.charAt(i) != n2.charAt(i)){
				return false;
			}
		}
		return true;
    }
	public static void main(String[] args){
		//Take a String input from the user using Scanner.

		 Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        // User-defined uppercase
        String manualUpper = toUpperCaseManual(text);
		String builtinUpper = text.toLowerCase();
		boolean isSame = compareStrings(manualUpper, builtinUpper);
		
		System.out.println("Uppercase using charAt(): " + manualUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtinUpper);
        System.out.println("Both results are equal: " + isSame);


	}
}
