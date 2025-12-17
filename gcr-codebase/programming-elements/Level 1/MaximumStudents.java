import java.util.*;
//Create a class MaximumStudent to find the maximum number of handshakes among N number of students.

public class MaximumStudents{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students : ")
		//Taking input of number of students
		int numberOfStudents = sc.nextInt();
		//Taking number of Handshakes
		int handshakes =  (numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.print("The maximum number of handshakes among "+numberOfStudents+ "students is " + handshakes );
	}
}