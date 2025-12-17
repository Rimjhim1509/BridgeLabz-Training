import java.util.*;
//Create a class TotalPrice to take input the unit price of an item and the quantity to be bought.Then, calculate the total price.
public class TotalPrice{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//taking Input of UnitPrice and Quantity
		System.out.print("Enter the quantity : ");
		int quantity  = sc.nextInt();
		System.out.print("Enter the unit price : ");
		int unitPrice = sc.nextInt() ;
		//Calculate the total Price of the quantity
		int totalPrice = quantity * unitPrice ;
		System.out.print("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	}
}