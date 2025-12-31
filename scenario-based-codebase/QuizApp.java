
import java.util.*;
public class QuizApp{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String[] questions ={"What is the size of int in Java?",
							"Which keyword is used to create an object in Java?",
							"Which loop is guaranteed to execute at least once?",
							"Which of the following is used to take input from the user in Java?",
							"What does break do in a loop?"
							};
		String[][] options={{"A. 2 bytes" ,"B. 4 bytes","C. 8 bytes" ,"D. Depends on system"},
							{"A. class" ,"B. objects","C. new" ,"D. create"},
							{"A. for" ,"B. while","C. do..while" ,"D. forEach"},
							{"A. System.in " ,"B. Scanner","C. InputStream" ,"D. Read"},
							{"A. Stops program " ,"B. Skips one iteration","C. Exits the loop" ,"D. Restarts loop"},
							};
		char[] answer =  {'B', 'C', 'C', 'B', 'C'};
		int score =0;
		for(int i =0 ; i<questions.length ; i++){
			System.out.println(questions[i]);
			for(int j =0 ; j < options[i].length ; j++){
				System.out.println(options[i][j]);
			}
			System.out.println("Your Answer ");
			char userAns = sc.next().toUpperCase().charAt(0);
			
			switch(userAns){
				case 'A' : case 'B' : case 'C' : case 'D' :
				if(userAns == answer[i]){
					score++;
					System.out.println("Correct");
				}
				else{
					System.out.println("Wrong");
				}
				break;
				default :
				System.out.print("Invalid input");
			}
		}
		System.out.print("Final Score : "+ score);
		
	}
}