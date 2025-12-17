//Create class VolumeOfEarth to compute the volume of Earth in km^3 and miles^3
public class VolumeOfEarth {
	public static void main(String[] args0){
		// Create variable radius as radius of Earth
		int radius = 6378 ;
		//Create  the variable volume to compute volume in kilometer 
		double volume = (4*3.14*radius*radius*radius)/3
		//Create  the variable volume_miles to compute volume in miles. 
		double volume_miles = volume*1.6 ;
		//Print the result of the volume of Earth in km^3 and miles^3
		System.out.print("The volume of earth in cubic kilometers is "+ volume+ " and cubic miles is "+ volume_miles);
	}
}