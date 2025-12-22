import java.util.Scanner;

public class Quadratic{
    public static void calculatedetails(double a , double b , double c) {
        return Math.pow(b,2)- 4*a*c;
		}
		public static void findRoots(double a, double b, double c) {
        double delta = calculateDelta(a, b, c);

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two real roots: " + root1 + " and " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root: " + root);
        } else {
            System.out.println("No real roots.");
        }
    }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        findRoots(a, b, c);
    }
}
