import java.util.* ;
public class LargestNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first value ");
		int number1  =  sc.nextInt();
		
		System.out.print("Enter the second value ");
		int number2 = sc.nextInt();
		
		System.out.print("Enter the third value ");
		int number3 = sc.nextInt();
		
	
		
		if(number1 > number2 && number1 > number3){
			System.out.println("Is the first number the largest? YES " + "\n"+
			"Is the second number the largest? NO" +"\n" +
			"Is the third number the largest?" );
		}
		else if(number1 > number2 && number1 > number3){
			System.out.println("Is the first number the largest? NO " + "\n"+
			"Is the second number the largest? YES" +"\n"+
			"Is the third number the largest? NO" ); 
			
		}
		else{
			
			System.out.println("Is the first number the largest? NO " + "\n"+
			"Is the second number the largest? NO" +"\n"+
			"Is the third number the largest? YES" );
		}
		
	}
}