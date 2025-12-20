import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Take number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error: Invalid number of persons");
            return;
        }

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        //  Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            double weight[i] = sc.nextDouble();

            System.out.print("Height (meters): ");
            double height[i] = sc.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input. Enter again.");
                i--; 
				continue;
            }
        }

        personData[i][0] = weight;
        personData[i][1] = height;
		
		for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

		

        }

    }
}
