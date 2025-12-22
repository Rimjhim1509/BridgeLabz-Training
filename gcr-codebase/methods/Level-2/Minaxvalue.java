import java.util.*;

public class MinMaxValue{
    public static int[] generate4DigitRandomArray(int size){
		int[] arr  = new int[size];
		for(int i = 0 ; i< size ; i++){
			arr[i] = 1000 + (int)(Math.random() *9000);
		}
		return arr ;
		
	}

		public static double[] findAverageMinMax(int[] numbers) {
			int min = numbers[0];
			int max = numbers[0];
			double sum =0;
			for(int num : numbers){
				sum+=num;
				min =Math.min(min , num);
				max= Math.max(max , num);
			}
			double avg = sum /numbers.length ;
			return new double[]{avg , min , max};
		}

   
    public static void main(String[] args) {
	   int size = 5;
       int[] randomNumber= generate4DigitRandomArray(size);
	   System.out.println("Random 4-digit numbers: " + Arrays.toString(randomNumber));

        double[] stats = findAverageMinMax(randomNumber);
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }
}
