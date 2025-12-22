import java.util.*;

class FactorChecker {

    public static int[] findFactors(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];

        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = FactorChecker.findFactors(number);

        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " +
                FactorChecker.greatestFactor(factors));
        System.out.println("Sum of Factors: " +
                FactorChecker.sumOfFactors(factors));
        System.out.println("Product of Factors: " +
                FactorChecker.productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " +
                FactorChecker.productOfCubeOfFactors(factors));
    }
}
