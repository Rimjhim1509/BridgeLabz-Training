import java.util.*;

public class MatrixUtility {

    public static double[][] generateRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10) + 1; // 1 to 10
        return matrix;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];

        return transpose;
    }

    public static double determinant2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2)
            throw new IllegalArgumentException("Matrix must be 2x2");
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

   
    public static double determinant3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3)
            throw new IllegalArgumentException("Matrix must be 3x3");
        double det = matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])
                   - matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])
                   + matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]);
        return det;
    }

   
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0)
            throw new ArithmeticException("Matrix is singular; cannot invert");

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }

  
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0)
            throw new ArithmeticException("Matrix is singular; cannot invert");

        double[][] inv = new double[3][3];

        inv[0][0] = (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]) / det;
        inv[0][1] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1]) / det;
        inv[0][2] = (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1]) / det;

        inv[1][0] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0]) / det;
        inv[1][1] = (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0]) / det;
        inv[1][2] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0]) / det;

        inv[2][0] = (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]) / det;
        inv[2][1] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0]) / det;
        inv[2][2] = (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0]) / det;

        return inv;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double[][] matrix2x2 = generateRandomMatrix(2,2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);
        System.out.printf("Determinant: %.2f%n", determinant2x2(matrix2x2));
        System.out.println("Inverse:");
        displayMatrix(inverse2x2(matrix2x2));
        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix2x2));

        double[][] matrix3x3 = generateRandomMatrix(3,3);
        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);
        System.out.printf("Determinant: %.2f%n", determinant3x3(matrix3x3));
        System.out.println("Inverse:");
        displayMatrix(inverse3x3(matrix3x3));
        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix3x3));
    }
}
