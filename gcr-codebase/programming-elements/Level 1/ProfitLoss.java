//Create the class 

public class ProfitLoss{
	public static void main(String[] args){
		//Create variable costPrice and sellingPrice as cost price and selling price in INR.
		int costPrice= 129 , sellingPrice= 191 ;
		int profit = sellingPrice - costPrice ;
		double percentageProfit = (profit * 100.0 )/costPrice;
		
		System.out.println("The Cost Price is INR "+ costPrice +
						   " and Selling Price is INR "+sellingPrice+ "\n"+
		                   "The Profit is INR "+ profit+ " and the Profit Percentage is "+ percentageProfit);
	}
}