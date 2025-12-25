import java.util.Scanner;

public class ChangeWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();
		
		String[] words = sentence.split(" ");
		String result = "";
		for(String word : words){
			if(word.equals(oldWord)){
				result+=newWord + " ";
				
			}
			else{
				result+=word+ " ";
			}
			
		}
		System.out.print(result);
    }
}
