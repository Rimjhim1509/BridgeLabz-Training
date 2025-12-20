import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Friends names
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height
        int[] age = new int[3];
        double[] height = new double[3];

        // Take input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        // Assume first friend is youngest & tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display result
        System.out.println("\nYoungest Friend: " + names[youngestIndex] +
                           " (Age: " + age[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                           " (Height: " + height[tallestIndex] + ")");

        sc.close();
    }
}
