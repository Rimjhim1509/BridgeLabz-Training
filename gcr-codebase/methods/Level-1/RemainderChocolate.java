import java.util.Scanner;

public class RemainderChocolate{
	public static int[] findRemainderAndQuotient(int numberOfchocolates , int numberOfChildren){
		int[] result = new int[2];
		int getChocolate = numberOfchocolates/numberOfChildren ;
		int remaining = numberOfchocolates % numberOfChildren ; 
		result[0] = getChocolate;
		result[1] = remaining ;
		return result ; 
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		int numberOfchocolates  = sc.nextInt();
		int numberOfChildren = sc.nextInt();
		
		int[] remainder= findRemainderAndQuotient(numberOfchocolates  ,numberOfChildren);
		System.out.print(" the quotienrt and remainder is "+ remainder[0] + " and " + remainder[1]);
		
        sc.close();
    }
}
