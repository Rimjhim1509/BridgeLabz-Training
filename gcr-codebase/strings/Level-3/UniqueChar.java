import java.util.Scanner;

public class UniqueChar{

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {

        int len = findLength(text);
        char[] temp = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[k] = current;
                k++;
            }
        }

        // Create final array of exact size
        char[] uniqueChars = new char[k];
        for (int i = 0; i < k; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] result = findUniqueCharacters(input);

        System.out.println("\nUnique characters are:");
        for (char c : result) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
