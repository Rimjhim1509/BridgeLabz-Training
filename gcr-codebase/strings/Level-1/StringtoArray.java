import java.util.* ;
public class StringtoArray{
	public static char[] getCharacter(String s){
		char[] stringArr = new char[s.length()];
		for(int i =0 ; i< s.length() ;i++){
			stringArr[i] = s.charAt(i);
		}
	return stringArr ;
	}
	public static boolean stringCompare(char[] arr1 , char[] arr2){
		if(arr1.length != arr2.length){
			return false ;
		}
		for(int i = 0 ; i < arr1.length ; i++){
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.next();
		//user-defined
		char[] userArray  =getCharacter(text);
		char[] builtmethod = text.toCharArray();
		boolean result = stringCompare(userArray , builtmethod);
		
		System.out.println("\nCharacters using user-defined method: " 
                           + Arrays.toString(userArray));
        System.out.println("Characters using toCharArray(): " 
                           + Arrays.toString(builtmethod));
        System.out.println("Both arrays are equal: " + result);
	}
}