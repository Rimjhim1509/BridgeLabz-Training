import java.util.*;
public class MeanHeight {
	public static void main(String[] args){
		//take input
		Scanner sc = new Scanner(System.in);
		int sum = 0 ;
		double[] heights = new double[11];
		for(int i = 0 ; i < heights.length ; i++){
			System.out.print(" the player " + i + " height : " );
			heights[i] = sc.nextDouble();
		}
		for(int i = 0 ; i< heights.length ; i++){
			sum+=heights[i];
		}
		int meanHeight = sum /11;
		System.out.print("Mean height of players is " + meanHeight);
	}
}