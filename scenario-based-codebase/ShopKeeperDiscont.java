import java.util.*;
public class ShopKeeperDiscont{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//how much percent discount will give
		double high_discount = 0.50 ;
		double low_discount = 0.10;
		double medium_discount = 0.30;
		double discountValue ;
		//no. of Items
		System.out.print("Enter the number of items : ");
		
		int item = sc.nextInt();
		//declare the variable to total cost calculate
		
		double totalBill = 0;
		// loop for the  cost of the item price of the bill
		for(int i =0 ; i < item ; i++){
			System.out.print("Enter the price of item "+ (i+1) +" : ");
			int itemprice = sc.nextInt();
			//add the total cost
			totalBill+=itemprice;
		}
		//if totalvalue is 5000 or more than that so will get discount 50%
		if(totalBill >= 5000){
			discountValue = totalBill*high_discount;
		//if totalvalue is 5000 or more than that so will get discount 30%
		}else if(totalBill >=3000){
			discountValue= totalBill*medium_discount;
		}
		//if totalvalue is 1000 or more than that so will get discount 10%
		else if(totalBill >=1000){
			discountValue = totalBill*low_discount;
		}
		else{
			discountValue =0;
			System.out.println("invalid price.. No discounts availab");
		}
		double totalPrice= totalBill - discountValue;
		System.out.print(totalPrice);
		
	}
}