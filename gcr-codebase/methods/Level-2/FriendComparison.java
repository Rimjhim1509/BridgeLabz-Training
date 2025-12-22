import java.util.Scanner;

public class Factors {
	public static int findYoungest(int[] ages){
		int minAge = age[0];
		int index = 0 ; 
		for(int i = 0 ; i < age.length ; i++){
			if(age < minAge){
				minAge = age[i];
				index = i ;
			}
		}
		return index ;
		
	}
	public static int findTallest(int[] heights) {
        int maxHeight = heights[0];
        int index = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return index;
    }
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		String[] names = {"Amar" , "Akbar", "Anthony"};
		int[] ages = new int[3];
		int[] heights = [3];
		 for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextInt();
        }
		int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);
		
		System.out.println("Youngest friend is: " + names[youngestIndex] +
                           " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest friend is: " + names[tallestIndex] +
                           " (Height: " + heights[tallestIndex] + " cm)");
    }
}
 