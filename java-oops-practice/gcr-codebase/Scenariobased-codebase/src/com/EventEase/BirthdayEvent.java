package com.EventEase;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String location, String date,
                         int attendees, User organizer,
                         double venueCost, double serviceCost) {

        super(eventName, location, date, attendees, organizer,
              venueCost, serviceCost, 500); // birthday discount
    }

    @Override
    public void schedule() {
        System.out.println("🎂 Birthday Event Scheduled!");
        System.out.println("Special decorations and cake arrangements included.");
    }
}
