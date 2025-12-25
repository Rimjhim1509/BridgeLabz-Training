import java.util.Scanner;

public class FrequentCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
		String str = sc.nextLine();
		int[] freqStore = new int[256];
		for(int i =0 ; i<str.length(); i++ ){
			char ch = str.charAt(i);
			freqStore[ch]++;
		}
		
		char mostFrequent = str.charAt(0);
        int maxCount = freqStore[mostFrequent];

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freqStore[ch] > maxCount) {
                maxCount = freqStore[ch];
                mostFrequent = ch;
            }
        }
		System.out.print("The freq store "+mostFrequent);
    }
}
	