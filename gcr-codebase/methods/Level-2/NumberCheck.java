import java.util.Scanner;

public class NumberCheckArray {

    /
    public static boolean isPositive(int num) {
        return num >= 0;
    }

   
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    
    public static int compare(int number1, int number2) {
        if (number1 > number2)
            return 1;
        else if (number1 == number2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " : ");

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }

        
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of first and last element:");
        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == 0) {
            System.out.println("First element is equal to last element");
        } else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}
