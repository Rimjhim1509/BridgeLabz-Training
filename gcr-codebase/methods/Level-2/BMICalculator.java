import java.util.Scanner;

public class BMI Calculator {
    public static void calculateBMI(double[][] num) {
        for(int i = 0 ; i < num.length ; i++){
			double weight = num[i][0];
            double heightCm = num[i][1];
            double heightMeter = heightCm / 100; 
			double bmi = weight / (heightMeter * heightMeter);
            num[i][2] = bmi;
		}
    }
	public static String[] getBMIStatus(double[][] num) {
        String[] status = new String[num.length];

        for (int i = 0; i < num.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi < 25)
                status[i] = "Normal";
            else if (bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        return status;
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
		double[][] persons = new double[10][3];

      
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

    
        calculateBMI(persons);

        String[] status = getBMIStatus(persons);
        sc.close();
    }
}
