//Create class for distributing the pens between given students.
public class PenDistribution{
	public static void main(String[] args){
		//Create variable pens and students to represent number of pens and students detail.
		int pens = 14,
		 students = 3;
		 
		//Create the variable distribute to show the number of students who get pens by using the division operator 
		int distribute = pens / students;
		
		//Create the variable remainingPens to show remaining student who didn't get pen.
		int remainingPens =  pens % students;
		
		//Print the statement of remaining and distributed pen
		System.out.print("The Pen Per Student is "+distribute+" and the remaining pen not distributed is " + remainingPens);
	}
}