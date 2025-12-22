import java.util.*;

public class LineAndDistance {

    public static double findDistance(double x1, double y1,
                                      double x2, double y2) {

        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);

        return Math.sqrt(dx + dy);
    }

    public static double[] findLineEquation(double x1, double y1,
                                            double x2, double y2) {

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        System.out.printf("\nEuclidean Distance = %.2f%n", distance);

        if (x1 == x2) {
            System.out.println("Equation of line: x = " + x1 + " (Vertical Line)");
        } else {
            double[] line = findLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of line: y = %.2fx + %.2f%n",
                              line[0], line[1]);
        }
    }
}
