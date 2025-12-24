import java.util.*;
public class ReverseString{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String reverse = "";
		int textLength = text.length()-1;
		for(int i = textLength ; i>= 0; i--){
			char ch = text.charAt(i);
			reverse = reverse + ch;
		}
		if(reverse == text){
			System.out.print("Palindromic");
		}
		System.out.print("Not a palindromic");
	}
}