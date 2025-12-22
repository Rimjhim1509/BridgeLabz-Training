import java.util.Scanner;

public class StudentVoteChecker {
	 public static boolean canStudentVote(int age){
		if(age <0){
			 return false ;
			 
		 }
		if(age >= 18){
			 System.out.print("Student can vote");
		 }
		else{
			 return false ;
		 }
		 
	 }
}
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		StudentVoteChecker checker = new StudentVoteChecker();

		System.out.print(" Enter the age : ");
		int[] ages = new int[10];
		for (int i = 0; i < ages.length; i++) {
			System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
			boolean canVote = checker.canStudentVote(ages[i]);
			if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }

		}
	
    }

 