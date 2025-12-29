package com.constructors.levelone;

public class HotelBooking {
	String guestName ;
	String roomtype ;
	int nights ;
	
	HotelBooking(){
		this.guestName = "Suman" ;
		this.roomtype = "Premium" ;
		this.nights = 3;
	}
	HotelBooking(String guestName, String roomtype, int nights ){
		this.guestName = guestName ;
		this.roomtype = roomtype ;
		this.nights = nights;
	}
	HotelBooking(HotelBooking other){
		this.guestName =other.guestName ;
		this.roomtype = other.roomtype;
		this.nights = other.nights;
	}

	void display(){
		System.out.println(guestName+" " + roomtype + " "+nights );
	}
	public static void main(String[] args) {
		HotelBooking h1 = new HotelBooking() ;
		HotelBooking h2 = new HotelBooking("Sum" , "Premium" , 8) ;
		HotelBooking h3 = new HotelBooking(h1) ;
		
		h1.display();
		h2.display();
		h3.display();
	}

}
