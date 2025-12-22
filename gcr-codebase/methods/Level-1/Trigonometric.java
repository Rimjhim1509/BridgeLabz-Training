import java.util.Scanner;

public class Trigonometric{
	public static  double[] calculateTrigonometricFunctions(double angle){
		double radians =  angle *3.14 /180 ;
		double sinValue =  Math.sin(radians);
		double cosValue = Math.cos(radians);
		double tanValue= Math.tan(radians);
		return new double[]{sinValue , cosValue , tanValue }; 
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the angle : ");
		double angle  = sc.nextDouble();
		
		
		double[] trigofunc= calculateTrigonometricFunctions(angle);
		System.out.println("Sine = " + trigofunc[0]);
        System.out.println("Cosine = " + trigofunc[1]);
        System.out.println("Tangent = " + trigofunc[2]);
		
        sc.close();
    }
}
