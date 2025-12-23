import java.util.*;

public class LeadingTrailingSpace {
	public static int[] findTrimIndexes(String text){
		int start= 0,end = text.length() - 1;
		while(start <=end && text.charAt(start)==' '){
			start++;
			
		}
		
		while(end >= start && text.charAt(end) == ' '){
			end--;
		}
		return new int[]{start ,end};
	}
	public static boolean createSubstring(String text, int start, int end){
		String result = "";
		for(int i =start ;i<end ; i++){
			result+=text.charAt(i);
		}
		return result ;
	}
	public static String compareStrings(String s1, String s2){
		if(s1.length() !=s2.length()){
			return false;
		}
		for(int i = 0 ; i< s1.length ;i++){
			if(s1[i] != s2[i]){
				return false ;
			}
		}
		return true;
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] indexes =findTrimIndexes(text);
		String manualTrim = createSubstring(indexes[0],indexes[1]);
		String builtinTrim = text.trim();

        // Compare results
        boolean result = compareStrings(manualTrim, builtinTrim);

        System.out.println("\nManual Trim Result : [" + manualTrim + "]");
        System.out.println("Built-in Trim Result: [" + builtinTrim + "]");
        System.out.println("Both results are equal: " + result);
    }
}
