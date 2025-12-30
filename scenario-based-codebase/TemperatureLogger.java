import java.util.*;
public class TemperatureLogger{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double sum =0;
		double[] temperature = new double[7];
		double max = temperature[0];
		for(int  i = 0 ;i < temperature.length ; i++){
			System.out.print("Enter the temperature of day "+ (i + 1)+" :" );
			temperature[i] = sc.nextInt();
			sum += temperature[i];
			
			if(max < temperature[i]){
				max = temperature[i] ;
			}
		}
		System.out.println("Maximum Temperature : " + max);
		double avg =  sum/7 ;
		System.out.println("Average temperature : " + avg);
		
	}
}