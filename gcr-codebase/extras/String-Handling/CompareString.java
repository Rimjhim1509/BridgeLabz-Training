import java.util.Scanner;

public class LexicographicalCompare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int result = compareStrings(s1, s2);

        if (result == 0)
            System.out.println("Strings are equal");
        else if (result < 0)
            System.out.println("First string comes before second string");
        else
            System.out.println("First string comes after second string");
    }
}

    