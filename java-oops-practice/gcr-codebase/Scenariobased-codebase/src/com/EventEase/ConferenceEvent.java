package com.EventEase;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String eventName, String location, String date,
                           int attendees, User organizer,
                           double venueCost, double serviceCost) {

        super(eventName, location, date, attendees, organizer,
              venueCost, serviceCost, 0);
    }

    @Override
    public void schedule() {
        System.out.println("🏢 Conference Scheduled!");
        System.out.println("Audio-visual systems and seating arrangements prepared.");
    }
}
