package com.EventEase;

import java.util.UUID;

public abstract class Event implements ISchedule {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    protected User organizer;

    private final String eventId;     // cannot be edited
    private double venueCost;
    private double serviceCost;
    private double discount;

    // Constructor without services
    public Event(String eventName, String location, String date,
                 int attendees, User organizer, double venueCost) {
        this(eventName, location, date, attendees, organizer, venueCost, 0, 0);
    }

    // Constructor with catering/decoration
    public Event(String eventName, String location, String date,
                 int attendees, User organizer,
                 double venueCost, double serviceCost, double discount) {

        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
        this.eventId = UUID.randomUUID().toString();
    }

    public String getEventId() {
        return eventId;
    }

    // Encapsulated pricing logic
    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public void showSummary() {
        System.out.println("Event: " + eventName);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println(eventName + " rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println(eventName + " has been cancelled.");
    }
}
