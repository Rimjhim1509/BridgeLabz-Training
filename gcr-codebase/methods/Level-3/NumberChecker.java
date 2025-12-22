import java.util.*;

class NumberChecker{
	
    public static int countDigits(int num){
		int count = 0;
		while(num != 0){
			count++;
			num = num/10 ;
		}
		return count;
	}
	public static int[] storedigitArr(int num){
		int count = countDigits(num);
		int[] store = new int[count] ;
		for(int i = count -1 ; i >=0 ; i++){
			store[i] = num%10 ;
			num/=10;
		}
		return store ;
	}
	public static boolean isDuck(int[] store){
		for(int i = 1 ; i< store.length;i++){
			if(store[i] !=0){
				return true;
			}
			
		}
		return false;
	}
	public static boolean checkArmstrong(int num ,int[] store ){
		int arms = 0 ;
		int pow = store.length ;
		
		for(int n : store){
			arms += Math.pow(n ,pow);
		}
		return arms == num ;
	}
	public static int[] findLargestAndSecondLargest(int[] store) {
        int largest = Integer.MAX_VALUE;
        int secondLargest = Integer.MAX_VALUE;

        for (int d : store) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }
	public static int[] findSmallestAndSecondSmallest(int[] store){
		int smallest = Integer.MIN_VALUE;
		int secondSmallest = Integer.MIN_VALUE ;
		for(int d : store){
			if(d<smallest){
				secondSmallest = smallest;
				smallest = d ;
				
			}else if(d > secondSmallest && d != smallest){
				secondSmallest = d;
			}
		}
		return new int[]{smallest, secondSmallest};   
	}
	
}
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = NumberChecker.storedigitArr(number);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Digit Count: " + NumberChecker.countDigits(number));
        System.out.println("Duck Number: " + NumberChecker.isDuck(digits));
        System.out.println("Armstrong Number: " +
                NumberChecker.checkArmstrong(number, digits));

        int[] largest = NumberChecker.findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largest[0]);
        System.out.println("Second Largest Digit: " + largest[1]);

        int[] smallest = NumberChecker.findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallest[0]);
        System.out.println("Second Smallest Digit: " + smallest[1]);
	}
}