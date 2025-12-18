import java.util. * ; 
//Create class Voting to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
public class Voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Take the input
		int personAge = sc.nextInt();
		//Check the age of person if the person's age is greater than 18 
		//then he/she can vote otherwise not
		if(personAge >= 18){
			System.out.print("The person's age is"+personAge+"and can vote.");
			
		}
		else{
			System.out.print("The person's age is"+personAge+"and cannot vote.");
		}
	}
}