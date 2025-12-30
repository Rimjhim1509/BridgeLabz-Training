import java.util.*;
public class PhoneRecharge{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int balance =0;
		while(true){
			
			
			System.out.println("Enter the operator by your choice : ");
			System.out.println("1. Jio Offer ");
			System.out.println("2. Airtel Dhamaka ");
			System.out.println("3. VI Unlimited  ");
			System.out.println("4. BSNL Family Plan ");
			int mobileOperator = sc.nextInt();
			
			
			switch(mobileOperator){
				case 1 -> {
					System.out.println("Available Jio Offers\n1.Standard : 150 || 2. Premium : 350 || 3. Special Offer : 600");
					System.out.print("Enter the amount to recharge your phone : ");
					int amount = sc.nextInt();
					if(amount== 150 || amount == 350 || amount == 600 ){
						balance +=amount;
						System.out.print("JIO recharge done successfully .and available balance is "+ balance);
					}
					else{
						System.out.print("Invalid Input ");
					}
				}
				case 2 -> {
					System.out.println("Available Airtel Offers\n1.Standard : 150 || 2. Premium : 350 || 3. Special Offer : 600");
					System.out.print("Enter the amount to recharge your phone : ");
					int amount = sc.nextInt();
					if(amount== 150 || amount == 350 || amount == 600 ){
						balance +=amount;
						System.out.print("Airtel recharge done successfully and available balance is "+ balance);
					}
					else{
						System.out.print("Invalid Input ");
					}
				}
					
				case 3 ->{
					System.out.println("Available VI Offers\n1.Standard : 150 || 2. Premium : 350 || 3. Special Offer : 600");
					System.out.print("Enter the amount to recharge your phone : ");
					int amount = sc.nextInt();
					if(amount== 150 || amount == 350 || amount == 600 ){
						balance +=amount;
						System.out.print("VI recharge done successfully and available balance is "+ balance);
					}
					else{
						System.out.print("Invalid Input ");
					}
				}
					
				case 4 ->{
					System.out.println("Available BSNL Offers\n1.Standard : 150 || 2. Premium : 350 || 3. Special Offer : 600");
					System.out.print("Enter the amount to recharge your phone : ");
					int amount = sc.nextInt();
					if(amount== 150 || amount == 350 || amount == 600 ){
						balance +=amount;
						System.out.print("BSNL recharge done successfully and available balance is "+ balance);
					}
					else{
						System.out.print("Invalid Input ");
					}
				}
					
				default -> {
					System.out.print("Invalid Operator.");
				}
					
			}
			
				System.out.print("Do you want to recharge it again ?  ");
				String choice = sc.next().toLowerCase();
				if(!choice.equals("yes")){
					break;
				}
			
		}
			
	}
}