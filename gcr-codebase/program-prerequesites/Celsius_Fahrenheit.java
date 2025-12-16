import java.util.*;

public class Celsius_Fahrenheit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int celsius = sc.nextInt();
		int temp_fahrenheit = (celsius* 9/5) + 32 ;
		System.out.print(temp_fahrenheit);

	}

}