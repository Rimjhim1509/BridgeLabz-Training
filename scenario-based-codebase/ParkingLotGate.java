import java.util.*;
public class ParkingLotGate {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// Options: Park, Exit, Show Occupancy
		int capacity = sc.nextInt();
		int occupied =0;
		int choice ;
		while(occupied < capacity){
			System.out.println("choose 1 : To PARK ");
			System.out.println("choose 2 : To EXIT ");
			System.out.println("choose 3 : To Show Occupancy ");
			System.out.println("choose 4 : Enter the choice : ");
			choice = sc.nextInt();
			switch (choice){
				case 1:
					if(occupied <capacity){
						occupied ++;
						System.out.println("vehicle Parked Successfully");
					}
					else{
						System.out.println("vehicle lot is full");
					}
					break;
				case 2:
					if(occupied > 0){
						occupied--;
						System.out.println("Exit is successfully");
					}
					else{
						System.out.println("Parking lot is Empty");
					}
				case 3:
					System.out.println("Occupied : " + occupied);
					System.out.println("Slots available : " + (capacity - occupied));
					break;
				case 4 :
					System.out.println("Exit the parking system  ");
				default :
					System.out.println("Try Again");
			}
		
			
		}
		
		System.out.print("Parking lot full");
		 
	}
	
}