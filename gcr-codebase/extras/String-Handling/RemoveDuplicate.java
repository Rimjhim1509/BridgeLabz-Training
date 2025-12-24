import java.util.*;
public class RemoveDuplicate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		//array to storeunique characters
		char[] result = new char[text.length()];
		int index= 0;
		//loop to traverse the string and check whether visited
		for(int i =0 ;i< text.length() ;i++){
			char current = text.charAt(i);
			boolean isDuplicate = false;
			for(int j = 0 ; j< text.length() ; j++){
				if(current == result[j]){
					isDuplicate =true;
					break;
				}
			}
			if(!isDuplicate){
				result[index] =current ;
				index++;
			}
		}
		System.out.print(result);
		
	}
}