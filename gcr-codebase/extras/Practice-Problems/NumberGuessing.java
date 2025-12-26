import java.util.*;

public class NumberGuessing {

    static Scanner sc = new Scanner(System.in); // global scanner

    public static void main(String[] args) {

        int lowerbound = 1, upperbound = 100;
        int attempt = 0;
        boolean isCorrect = false;

        System.out.println("Think of a number between 1 and 100.");

        while (!isCorrect) {

            int guess = generateGuess(lowerbound, upperbound);
            attempt++;

            System.out.println( guess + " ?");
            System.out.print("Enter feedback (high / low / correct): ");
            String feedback = getFeedback();

            if (feedback.equals("high")) {
                upperbound = guess - 1;
            } 
            else if (feedback.equals("low")) {
                lowerbound = guess + 1;
            } 
            else if (feedback.equals("correct")) {
                isCorrect = true;
                System.out.println("Guessed correctly in " + attempt + " attempts!");
            }
        }
    }

    // method to generate guess
    public static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    // method to read feedback
    public static String getFeedback() {
        return sc.next().toLowerCase();
    }
}
