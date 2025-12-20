import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
		int count = 0
		int temp = number;
		int count = 0 ;
		while(temp > 0){
			count ++ ;
			temp =temp/10;
		}
		int[] digits = new int[count] ;
		temp = number;
		index = 0 ;
		while(temp >0){
			int lastDigit = temp %  10 ;
			index++;
			temp /10;
			
		}
		int[] freq = new int[10];
		for(int i = 0 ; i< count ; i++){
			freq[digits]++;
		}
		for(int i = 0 ; i< freq.length ; i++){
			System.out.print(freq[i]);
		}

        sc.close();
    }
}
