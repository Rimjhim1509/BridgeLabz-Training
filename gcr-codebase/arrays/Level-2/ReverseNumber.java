import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Enter a positive number");
            return;
        }

        int temp = number;

        // Step 2: Find count of digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;  // last digit
            index++;
            temp = temp / 10;
        }

        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }

        sc.close();
    }
}
