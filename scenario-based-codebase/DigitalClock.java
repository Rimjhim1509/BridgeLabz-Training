
import java.util.*;
public class DigitalClock{
	public static void main(String[] args){
		
		for(int i =0 ; i < 23 ; i++){
			for(int j = 0 ; j< 60 ; j++){
				if(i == 13 && j == 0){
					return ;
				}
				System.out.printf("%02d:%02d\n",i,j );
			}
			
		}
		
	}
}