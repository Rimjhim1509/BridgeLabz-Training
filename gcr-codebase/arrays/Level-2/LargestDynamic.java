import java.util.Scanner;

public class LargestDynamic{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Enter a positive number");
            return;
        }

        // Step 2: Initialize array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 3: Store digits with dynamic resizing
        while (number != 0) {

            // Hint-f reworked: increase size instead of break
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;          
                int[] temp = new int[maxDigit];   

                // copy old data
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // assign back
            }

            digits[index] = number % 10;  
            index++;

            number = number / 10;         
        }

        // Step 4: Find largest and second largest
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 5: Display result
        System.out.println( largest);
        System.out.println( secondLargest);

        sc.close();
    }
}
