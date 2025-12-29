import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        while (true) {
            System.out.print("Enter age (or -1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                System.out.println("Voting ended.");
                break;
            }

            if (age >= 18) {
                System.out.println("Eligible to vote");
                System.out.println("Vote for candidate:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Vote recorded for Candidate A");
                        break;
                    case 2:
                        System.out.println("Vote recorded for Candidate B");
                        break;
                    case 3:
                        System.out.println("Vote recorded for Candidate C");
                        break;
                    default:
                        System.out.println("Invalid vote");
                }
            } else {
                System.out.println("Not eligible to vote");
            }
        }
        sc.close();
    }
}
