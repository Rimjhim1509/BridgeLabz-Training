import java.util.*;
public class PalindromeChecker{
	public static void main(String[] args){
		Scanner sc  = new  Scanner(System.in);
		String text  = sc.nextLine();
		if(isPalindrome(text)){
			System.out.print("Palindrome");
		}else{
			System.out.print("Not a Palindrome");
		}
		
		 
	}
	public static boolean isPalindrome(String text){
		String reverse = "";
		for(int i = text.length()-1;i>0; i--){
			char ch = text.charAt(i);
			reverse +=ch ;
			
		}
		if(reverse == text){
				return true;
			}else{
				return false;
			}
	}
}