// Ticket Booking App 🎬
//Ask users for movie type, seat type (gold/silver), and snacks.
// Use switch and if together.
// Loop through multiple customers.
// Clean structure and helpful variable names.

import java.util.*;
public class MovieBooking {
	public static void main(String[] args){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter which genre movie you want to watch : ");
			System.out.println("1. Thriller	2.Comedy	3.Romantic	 4.Action");
			int movieType = sc.nextInt();
			int totalPrice =0;
			int snacks=0 ;
			switch(movieType){
				case 1 -> {
					System.out.println("You choose Thriller movie to watch ...Bravo !!");
					
				}
				case 2 ->{ 
					System.out.println("You choose Comedy movie to watch ...Fun !!");
					
				}
				case 3 ->{
					System.out.println("You choose Romantic movie to watch ... !!");
					
				} 
				case 4 -> {
					System.out.println("You choose Action movie to watch.");
					
				}
				default -> {
					System.out.println("Invalid movie type!"); 
					continue;
				}
				
			}
			System.out.println("Enter the seat type you prefer : \n 1.Gold	2.Silver ");
			int userType = sc.nextInt();
			switch(userType){
				case 1 -> {
					System.out.println("You chose Gold Seat.\n Ticket Price:- Rs.300  ");
				totalPrice+=300;
				}
				case 2 -> {
				System.out.println("You chose Silver Seat.\n Ticket Price:- Rs.200  ");
				totalPrice+=200;
				}
				default-> {
				System.out.println("You chose invalid seat type. please enter correct seat .");
				continue;
				}
			}
		
			
			System.out.println("Do customer want snacks ? (y/n)");
			char choice = sc.next().charAt(0);
			if(choice == 'y'){
				System.out.println("Have your snacks and enjoy your movie.");
				snacks+=200;
			}
			else{
				System.out.println("enjoy your movie.");
			}
			
			System.out.println("Total Amount : "+(totalPrice +snacks));
			System.out.println("Next Customer ?(y/n)");
			char customer = sc.next().charAt(0);
			if(customer != 'y'){
				System.out.println("Done with movie ticket booking.");
				break;
			}
		
		}
	}
}