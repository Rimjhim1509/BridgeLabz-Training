import java.util.Scanner;

public class Factors {
	public static  int[] findFactors(int number){
		int count = 0 ;
		for(int i = 1 ; i<= number ; i++){
			if( number % i==0){
				count++ ;
			}
		}
		int[] factors = new int[count];
		int index =0 ;
		for(int i = 1 ; i < number ; i++){
			if(number % i == 0){
				factors[index++] = i;
			}
		}
		return factors ; 
	}
	//Method to find Sum of factors 
	public static int sumFactor(int[] factors){
		int sum = 0 ;
		for(int i = 0 ; i< factors.length ; i++){
			sum +=factors[i];
		}
		return sum ;
	}
	public static int productFactor(int[] factors){
		int product = 1 ;
		for(int i = 0 ; i< factors.length ; i++){
			product *=factors[i];
		}
		return product ;
	}
	public static int findSumSquare(int[] factors){
		int sumSq = 0 ;
		for(int i = 0 ; i< factors.length ; i++){
			sumSq +=Math.pow(factors[i] , 2);
		}
		return sumSq ;
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		int number = sc.nextInt();

		int[] factors = findFactors(number); 
		for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
		int sum = sumFactor(factors);
		int product = productFactor(factors);
		int sunSquare = findSumSquare(factors);
		System.out.print("The factors and sum and product of factors are sum is "+sum+" and product is " +product+ " and sum square is "+ sunSquare);
        sc.close();
    }
}
 