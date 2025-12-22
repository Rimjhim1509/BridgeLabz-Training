import java.util.*;
public static boolean checkString(String str1 ,String str2){
	if(str1.length() != str2.length()){
		return false;
	}
	
	for(int i = 0 ; i < str1.length() ; i++){
		if(str1.charAt(i) != str2.charAt(i)){
			return false;
		}
	}
	return true;
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String str1 = sc.next();
	String str2 = sc.next();
	boolean charAtstrings = checkString(str1 , str2);
	boolean equalsString = str1.equals(str2);
	if(charAtstrings == equalsString ){
		System.out.print("Comparison using charAt : " + charAtstrings);
	}
	else {
		System.out.println("Comparison are not equal");
	}
}