import java.util.*;

public class TallestMean{
    public static int[] generate4DigitRandomheight(int size){
		int[] heights  = new int[11];
		for(int i = 0 ; i< heights.length ; i++){
			heights[i] = 150 + (int)(Math.random() *101);
		}
		return heights ;
		
	}
	public static int sumOfheights(int[] heights ){
		int sum = 0 ;
		for(int num : heights){
			sum+=num;
		}
		return sum ;
	}
	public static double meanOfHeight(int[] heights ){
		int sum = sumOfheights(heights) ;
		for(int num : heights){
			sum+=num;
		}
		return (double)sum/heights.length ;
	}
	public static int findShortest(int[] heights){
		int shortest = heights[0];
		for(int h : heights){
			shortest = Math.min(shortest , h);
		}
		return shortest ;
	}
	public static int findTallest(int[] heights){
		int tall = heights[0];
		for(int h : heights){
			tall = Math.max(tall , h);
		}
		return tall;
	}

    public static void main(String[] args) {
	   int[] heights = generate4DigitRandomheight(11);
	    System.out.println("Heights of football players (in cm):");
        System.out.println(Arrays.toString(heights));

        System.out.println("\nResults:");
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + meanOfHeight(heights) + " cm");
    }
}
