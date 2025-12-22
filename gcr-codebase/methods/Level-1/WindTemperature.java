import java.util.Scanner;

public class WindTemperature{
	public static double calculateWindChill(double temp, double windSpeed){
		double windChill =  (35.74 + 0.6215 *temp) + (0.4275*temp - 35.75) * windSpeed;
		return windChill ; 
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the temperature and windSpeed  : ");
		double temp  = sc.nextDouble();
		double windSpeed  = sc.nextDouble();
		
		double windChill= calculateWindChill(temp  ,windSpeed);
		System.out.print(" the windchill is "+ windChill);
		
        sc.close();
    }
}
