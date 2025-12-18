import java.util.*;
//Create class to show the 
 class CountDown {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//take the input
		
		System.out.print("Enter the number : ");
		//user will entered the number until prints to 0 using while loop
		while(true){
		  double userValue  = sc.nextDouble();
		  //when the user print 0 it will come out of the loop with return statement
			if(userValue== 0 ){
				System.out.print("User entered 0");
				return;
			}
			//until it print 0 message will pass as invalid 
			else{
				System.out.println("Invalid input.. please enter valid input 0");
			}
		}
		
	}
 }
