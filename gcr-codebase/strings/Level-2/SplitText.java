import java.util.*;
public class SplitText{
	
	public static int findlength(String text){
		int count = 0;
		try{
			while(true){
				text.charAt(count);
				count++;
			}
		}
			catch (StringIndexOutOfBoundsException e) {
            
        }return count;
	}
    //Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
//Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
//Then Create an array to store the words and use the indexes to extract the words
	public static String[] manualSplit(String text){
		int len = findlength(text);
		int wordCount =1;
		for(int i =0 ; i< len ; i++){
			if(text.charAt(i) == ' '){
				wordCount++;
			}
		}
		int[] spaceIndex = new int[wordCount +1];
		int idx =1 ;
		 spaceIndex[0] = -1 ;
		for(int i= 0 ; i< len ; i++){
			if(text.charAt(i) == ' '){
				spaceIndex[idx] = i ;
				idx++;
			}
		}
		spaceIndex[idx] =len ;
		
		//storing the index done now extarct word from it
		String[] words = new String[wordCount];
		
		for(int i = 0 ; i< wordCount ; i++){
			String word = "";
			for(int j = spaceIndex[i]+1; j < spaceIndex[i+1];j++){
				word +=text.charAt(j);
			}
			words[i] =word ;
		}
		return words ;
	}
	public static boolean compareArrays(String[] str1 ,String[] str2){
		if(str1.length != str2.length){
			return false;
		}
		for(int i = 0 ; i< str1.length ;i++){
			if(!str1[i].equals(str2[i])){
				return false ;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // User-defined split
        String[] manualWords = manualSplit(text);

        // Built-in split
        String[] builtinWords = text.split(" ");

        // Compare results
        boolean result = compareArrays(manualWords, builtinWords);
		System.out.println("\nWords using charAt():");
		for(String word : manualWords){
			System.out.println(word);
		}
		System.out.println("\nWords using split():");
        for (String word : builtinWords) {
            System.out.println(word);
        }

        System.out.println("\nBoth results are equal: " + result);

	}
}
