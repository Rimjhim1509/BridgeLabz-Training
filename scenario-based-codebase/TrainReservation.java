import java.util.*;
public class TrainReservation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sleeperClass = 20 ;
		int economyClass = 15 ;
		int acClass = 10;
		
		while(true){
			System.out.println(" Enter the choice you want :");
			System.out.println("1.Book	2.Available Seats	3.Exit ");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1 -> {
					System.out.println("Enter the choice to book a ticket : ");
					System.out.println("1.  Sleeper Class are : "+ sleeperClass);
					System.out.println("2. Economy Class are : "+ economyClass);
					System.out.println("3. AC class are : "+ acClass);
					
					int classChoice = sc .nextInt();
					
					switch(classChoice){
						case 1 -> {
							System.out.println("Enter the no. of ticket to book : ");
							int bookSeat = sc.nextInt();
							if(bookSeat > sleeperClass ){
								System.out.println("Not able to book the ticket .");
							}else{
								sleeperClass-=bookSeat;
								System.out.println("Y :"+ bookSeat);
								System.out.println("Available Seats in Sleeper Class are :"+ sleeperClass);
							}
						}
						case 2 -> {
							System.out.println("Enter the no. of ticket to book : ");
							int bookSeat = sc.nextInt();
							if(bookSeat > economyClass ){
								System.out.println("Not able to book the ticket .");
							}else{
								economyClass-=bookSeat;
								System.out.println("You have booked tickets :- "+ bookSeat);
								System.out.println("Available Seats in Economy Class  are :"+ economyClass);
							}
						}
						case 3 -> {
							System.out.println("Enter the no. of ticket to book : ");
							int bookSeat = sc.nextInt();
							if(bookSeat > acClass ){
								System.out.println("Not able to book the ticket .");
							}else{
								acClass-=bookSeat;
								System.out.println("You have booked tickets :"+ bookSeat);
								System.out.println("Available Seats in AC class are :"+ acClass);
							}
						}
					}
					
					
				}
				case 2 ->{
					
					System.out.println("Available Seats are " + sleeperClass);
					System.out.println("Available Seats are " + economyClass);
					System.out.println("Available Seats are " + acClass);
				}
				case 3  ->{
					System.out.print("Train Reservation Closed ..");
				}
			}
			if(choice == 3 ){
				break;
			}
			
			
		}
	}
}
//Show menu with switch
// Allow multiple bookings using while-loop.
//Stop booking once seats reach zero (break).
