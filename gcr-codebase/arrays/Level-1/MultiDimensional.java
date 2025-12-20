import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        // Step 2: Create 2D array (Matrix)
        int[][] matrix = new int[rows][columns];

        // Step 3: Take input for matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {          // outer loop → rows
            for (int j = 0; j < columns; j++) {   // inner loop → columns
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 4: Create 1D array
        int[] array = new int[rows * columns];

        // Step 5: Copy elements from 2D to 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Step 6: Print 1D array
        System.out.print("1D Array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
