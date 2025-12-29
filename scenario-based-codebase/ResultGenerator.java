import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int marks;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            marks = sc.nextInt();
            total += marks;
        }

        int average = total / 5;
        System.out.println("Average Marks: " + average);

        int gradeCategory = average / 10;

        switch (gradeCategory) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            case 5:
            case 4:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: Fail");
        }
        sc.close();
    }
}
