import java.util.*;
public class CountVowelConsonant{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i = 0 ; i< text.length() ;i++){
			char ch = text.charAt(i);
			if(ch>='a'&& ch<='z'){
				if(ch == 'a' || ch == 'e'|| ch=='i'||ch =='o' || ch == 'u'){
					vowelCount++;

				}
					consonantCount++;
			}
		}
		System.out.println("Vowels "+vowelCount);
		System.out.print("Consonant "+ consonantCount);
	}
	
}