import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMIAndStatus(double weight, double heightCm) {

        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);


        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{
                String.valueOf(weight),
                String.valueOf(heightCm),
                String.valueOf(bmi),
                status
        };
    }


    public static String[][] processBMI(double[][] data) {

        int persons = data.length;
        String[][] result = new String[persons][4];

        for (int i = 0; i < persons; i++) {
            result[i] = calculateBMIAndStatus(data[i][0], data[i][1]);
        }

        return result;
    }

    public static void displayResult(String[][] result) {

      
        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    result[i][3]
            );
        }
    }

  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2]; 

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(data);
        displayResult(result);

        sc.close();
    }
}
