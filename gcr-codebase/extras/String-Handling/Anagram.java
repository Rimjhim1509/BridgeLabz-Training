import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase();
		
		boolean isAnagram = true;
		if(s1.length() != s2.length()){
			System.out.print("Different length not allowed");
			 isAnagram = false;
		}
		else{
			int[] freq = new int[256];
			for(int i = 0 ; i<s1.length() ; i++){
				char ch = s1.charAt(i);
				freq[ch]++;
				freq[s2.charAt(i)]--;
			}
			
			for(int count :freq){
				if(count != 0){
					isAnagram =false;
					break;
				}
				isAnagram =true;
			}
		
		}
        if (isAnagram)
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are NOT Anagrams");
    }
}
