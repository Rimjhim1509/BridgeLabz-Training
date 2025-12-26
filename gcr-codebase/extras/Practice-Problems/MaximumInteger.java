import java.util.*;
public class MaximumInteger {
	public static void main(){
		Scanner sc = new Scanner(System.in);
		int[] numbers = getinput(sc);     // pass scanner
        int max = findMax(numbers);

		System.out.print("Maximum "+max);
	}
	public static int[]getinput(Scanner sc){
		int[] arr = new int[3];
		for(int i = 0 ; i< 3; i++){
			arr[i] =sc.nextInt();
		}
		return arr ;
	}
	public static int findMax(int[] arr){
		int max = arr[0];
		for(int i = 1 ; i < 3 ; i++){
			if(arr[i] >max){
				max = arr[i];
			}
		}
		return max;
	}
}