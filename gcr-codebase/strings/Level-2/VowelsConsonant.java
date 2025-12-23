import java.util.*;
public class SplitText{
	
	public static String checkChar(char ch){
		if(ch>='A' && ch<='Z'){
			ch = (char)(ch+32);
		}
		if(ch>='a' && ch<='z')
		{
			if(ch =='a' || ch == 'e'||ch =='i' || ch == 'o'|| ch == 'u'){
			return "Vowels";
		}
		else{
		return "Consonant";	
		}
		}
		return "Not a letter";
	}
	public static int[] countVowelsConsonants(String text) {
		int vowelCount = 0, consonantCount = 0;
		for(int i =0 ; i< text.length() ;i++){
			//Loop through string using charAt(i)
			String result = checkChar(text.charAt(i));
			if (result.equals("Vowels")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
		}
		return new int[]{vowelCount, consonantCount};
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

       
        int[] count = countVowelsConsonants(text);

        System.out.println("Vowels count: " + count[0]);
        System.out.println("Consonants count: " + count[1]);
       

	}
}
