import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display BMI value
        System.out.println("BMI = " + bmi);

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }
    }
}
