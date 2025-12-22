import java.util.*;
public class CreateSubstring{
	public static String findString(String s ,int start ,int end){
		//create String empty
		String sub = "";
		//add in string from th start to end
		for(int i =start ; i <= end ; i++){
			sub+=s.charAt(i);
		}
		return sub;
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		//enter a string
		String str1 = sc.next();
		//first index
		int start = sc.nextInt();
		//last index
		int end = sc.nextInt();
		String resultchar = findString(str1 , start , end);
		System.out.print("the new string is " + resultchar);
	}
}