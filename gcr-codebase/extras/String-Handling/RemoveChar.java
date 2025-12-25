import java.util.Scanner;

public class RemoveChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        char s2 = sc.next().charAt(0);
		String result ="" ;

        for(int i=0 ; i< s1.length() ;i++ ){
			char ch = s1.charAt(i);
			if(ch != s2){
				result +=ch;
			}
		}
		System.out.print(result);
    }
}
