package com.TourMate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Hotel hotel, Transport transport, Activity activity) {
        super(destination, duration, hotel, transport, activity);
    }

    @Override
    public void book() {
        System.out.println("International Trip booked with visa processing");
    }

    @Override
    public void cancel() {
        System.out.println("International Trip cancelled");
    }
}
