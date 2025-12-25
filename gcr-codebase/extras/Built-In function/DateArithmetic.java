import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDate = sc.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

       
        date = date.plusDays(7);

        date = date.plusMonths(1);

        date = date.plusYears(2);

        date = date.minusWeeks(3);

        System.out.println("Final calculations: " + date);
    }
}
