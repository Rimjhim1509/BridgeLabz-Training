import java.util.*;
public class Otpgenerator{
	public static int[] otpgenerate(int digit){
		int[] otp = new int[digit] ;
		for(int i =0 ;i< digit ; i++){
			otp[i] =100000 + (int)(Math.random() *900000);
		}
		return otp ;
		
	}
	public static boolean otpsame(int[] otp){
		for(int i = 0 ; i< otp.length ; i++){
			for(int j = i + 1 ; j< otp.length ;j++){
				if(otp[i] == otp[j]){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args){
		int digit = 10 ;
		int[] otp = otpgenerate(digit);
		boolean otpsameornot = otpsame(otp);
		System.out.println(" OTP is "+Arrays.toString(otp) );
		System.out.println(" OTP is unique "+ otpsameornot);
	}
}
	