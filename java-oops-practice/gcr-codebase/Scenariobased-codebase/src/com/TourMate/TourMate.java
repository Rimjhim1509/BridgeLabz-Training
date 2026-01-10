package com.TourMate;

public class TourMate {
    public static void main(String[] args) {

        Hotel hotel = new Hotel(20000);
        Transport transport = new Transport(15000);
        Activity activity = new Activity(5000);

        Trip trip = new InternationalTrip(
                "Paris", 7, hotel, transport, activity);

        trip.book();
        System.out.println("Total Budget: ₹" + trip.calculateTotalBudget());
    }
}
