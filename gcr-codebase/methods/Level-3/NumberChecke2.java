import java.util.*;

public class NumberChecke2{
	
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
	
	public static int sumOfSquares(int[] store){
		int sum = 0 ;
		for(int d : store){
			sum +=Math.pow(d ,2);
			
		}
		return sum;
	}
	public static int sumOfDigit(int[] store){
		int sum = 0;
		for(int d:store){
			sum +=d ;
		}
		return sum ;
	}
	public static boolean harshadNum(int num , int[] store){
		int size =sumOfDigit(store) ;
		return num %size == 0 ;
	}
	public static int[][] countFreq(int[] store){
		int[][] freq = new int[10][2];
		for(int i=0 ; i< store.length;i++){
			freq[i][0] = i;
			
		}
		for(int d:store){
			freq[d][1]++ ;
		}
		return freq ;
	}
	
}
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = NumberChecke2.storedigitArr(number);
        System.out.println("Digit Count: " + NumberChecke2.countDigits(number));
		System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of squares : " + NumberChecke2.sumOfSquares(digits));
        System.out.println("Harshad Number: " +
                NumberChecke2.harshadNum(number ,digits));

       int[][]frequency = NumberChecke2.countFreq(digits);
	   for(int i = 0 ; i< 10 ;i++){
		   if(frequency[i][0] > 1){
			   System.out.print(frequency[i][0] + "      " + frequency[i][1]);
		   }
	   }
	}
}