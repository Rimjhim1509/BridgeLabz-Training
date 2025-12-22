import java.util.*;

public class ZaraBonusCalculator {

    
    public static int[][] generateEmployeeData(int employees) {

        int[][] data = new int[employees][2];

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);

            data[i][1] = 1 + (int)(Math.random() * 10);
        }
        return data;
    }

 
    public static double calculateBonus(int salary, int years) {
        if (years > 5) {
            return salary * 0.05;
        } else {
            return salary * 0.02;
        }
    }

    public static void main(String[] args) {

        int employees = 10;
        int[][] empData = generateEmployeeData(employees);

        double totalBonus = 0;

        System.out.println("Emp\tSalary\tYears\tBonus\tNew Salary");

        for (int i = 0; i < employees; i++) {

            int salary = empData[i][0];
            int years = empData[i][1];

            double bonus = calculateBonus(salary, years);
            double newSalary = salary + bonus;

            totalBonus += bonus;

            System.out.printf(
                "%d\t%d\t%d\t%.2f\t%.2f%n",
                (i + 1), salary, years, bonus, newSalary
            );
        }

        System.out.println("\nTotal Bonus Paid by Zara: " + totalBonus);
    }
}
