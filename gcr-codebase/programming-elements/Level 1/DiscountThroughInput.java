import java.util.*;
public class DiscountThroughInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Student Fee: ");
		int fee = sc.nextInt();
		System.out.print("Enter the Discount percent: ");
		int discountPercent = sc.nextInt() ;
		//Create the variable discount and assign it to find discount of student by division operator
		int discount = (fee * discountPercent)/100 ; 
		
		//Create the variable discountPrice to find discounted price the student will pay for the course.
		int discountPrice = fee - discount;
		
		//Print the discounted amount and discounted price the student will pay for the course.
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR " + discountPrice);
		
	}
}