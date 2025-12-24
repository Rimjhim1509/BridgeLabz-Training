import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findCharacterFrequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequency = findCharacterFrequency(input);

        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + " -> " + frequency[i][1]);
        }

        sc.close();
    }
}
