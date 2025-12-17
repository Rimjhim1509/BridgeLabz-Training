//Create class to convert the distance of kilometers into miles
public class KilometerToMiles {
	public static void main(String[] args){
		//Create variable distance measured in kilometers
		double distance = 10.8 ;
		//Create variable distanceMiles to convert the distance given in
		//kilometer to miles.
		
		double distanceMiles = distance * 1.6;
		//Print the distance in miles.
		System.out.print("The distance "+ distance+" km in miles "+ distanceMiles);
	}
}
