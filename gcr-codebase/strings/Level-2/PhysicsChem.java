import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10; // 10–99
            }
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][3]; // Total, Average, Percentage

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Method to calculate grade
    public static String[][] calculateGrades(double[][] results) {
        int students = results.length;
        String[][] grades = new String[students][1];

        for (int i = 0; i < students; i++) {
            double percentage = results[i][2];

            if (percentage >= 80)
                grades[i][0] = "C";
            else if (percentage >= 79)
                grades[i][0] = "B";
            else if (percentage >= 69)
                grades[i][0] = "D";
            else if (percentage >= 59)
                grades[i][0] = "C";
            else if (percentage >= 49)
                grades[i][0] = "E";
            else
                grades[i][0] = "R";
        }
        return grades;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results, String[][] grades) {

        System.out.println("STUDENT SCORECARD");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("  ");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                (int) results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "\t" +
                grades[i][0]
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] pcmScores = generatePCMScores(students);
        double[][] results = calculateResults(pcmScores);
        String[][] grades = calculateGrades(results);

        displayScoreCard(pcmScores, results, grades);

        sc.close();
    }
}
