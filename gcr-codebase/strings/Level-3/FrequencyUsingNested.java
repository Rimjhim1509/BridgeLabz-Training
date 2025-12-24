import java.util.Scanner;

public class FrequencyUsingNested {

    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            freq[i] = 1;

            if (chars[i] == '0')
                continue;

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " -> " + freq[i];
				 index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] frequency = findCharacterFrequency(input);

        System.out.println("\nCharacter Frequency:");
        for (String s : frequency) {
            System.out.println(s);
        }

        sc.close();
    }
}
