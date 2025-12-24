import java.util.*;
public class ReverseString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String reverse = "";
		int textLength = text.length()-1;
		for(int i = textLength ; i>= 0; i--){
			char ch = text.charAt(i);
			reverse = reverse + ch;
		}
		if(reverse.equals(text)){
			System.out.print("Palindromic");
		}else{
			System.out.print("Not a palindromic");
		}
		
	}
}