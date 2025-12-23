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
	public static String[][] storeString(String[] words){
		String[][] result = new String[words.length][2] ;
		
		for(int i = 0 ; i< words.length ; i++){
			int len = findlength(words[i]);
			result[i][0] = words[i];
			result[i][1] = String.valueOf(len);

		}
		return result ;
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

	
		String[][] table = storeString(manualWords);
		System.out.println("\nWord\tLength");
        System.out.println("---------------");

        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t" + length);
        }

       

	}
}
