import java.util.*;
public class EligibilityAge {
	public static int[] generateAges(int n){
		int[] ages = new int[n];
		
		for(int i =0 ; i < n ; i++){
			ages[i] = (int) (Math.random() * 90) + 10;
		}
		return ages;
	}
	public static int[][] checkVotingEligibility(int[] ages){
		String[][] ageArray = new String[ages.length][2];
		for(int i = 0 ; i< ages.length ; i++ ){
			if(ages[i] <0){
				ageArray[i][1] = "false";
			}
			else if(ages[i] >=18){
				ageArray[i][1] = "true";
			}else{
				ageArray[i][1] = "false";
			}
			
		}
		return ageArray ;
	}
	public static void displayResult(String[][] data) {
        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            boolean canVote = Boolean.parseBoolean(data[i][1]);
            System.out.println(data[i][0] + "\t" + canVote);
        }
    }

   
    public static void main(String[] args) {
        int numberOfStudents = 10;

        int[] ages = generateAges(numberOfStudents);
        String[][] votingData = checkVotingEligibility(ages);
        displayResult(votingData);
    }
}