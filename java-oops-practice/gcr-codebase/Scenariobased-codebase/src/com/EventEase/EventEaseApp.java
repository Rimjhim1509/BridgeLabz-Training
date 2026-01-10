package com.EventEase;

public class EventEaseApp {

    public static void main(String[] args) {

        User u1 = new User("Riya Sharma", "riya@gmail.com");

        Event birthday = new BirthdayEvent(
                "Riya's Birthday",
                "Banquet Hall",
                "20-May-2026",
                50,
                u1,
                20000,
                8000
        );

        Event conference = new ConferenceEvent(
                "Tech Conference",
                "Convention Center",
                "10-June-2026",
                300,
                u1,
                100000,
                25000
        );

        birthday.schedule();
        birthday.showSummary();

        System.out.println();

        conference.schedule();
        conference.showSummary();

        conference.reschedule("12-June-2026");
    }
}
