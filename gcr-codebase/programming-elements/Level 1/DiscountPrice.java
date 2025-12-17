//Create class to show the dicount in the fee.

public class DiscountPrice {
	public static void main(String[] args){
		
		// Create the variable fee , discountPercent to represent Students Fee and his discounted Price.
		int fee= 12500 , discountPercent = 10 ;
		
		//Create the variable discount and assign it to find discount of student by division operator
		int discount = (fee * discountPercent)/100 ; 
		
		//Create the variable discountPrice to find discounted price the student will pay for the course.
		int discountPrice = fee - discount;
		
		//Print the discounted amount and discounted price the student will pay for the course.
		System.out.println(" The discount amount is INR "+discount+" and final discounted fee is INR " + discountPrice);
		
	}
}