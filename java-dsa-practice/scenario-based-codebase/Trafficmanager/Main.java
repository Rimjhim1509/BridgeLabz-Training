package com.Trafficmanager;

public class Main {
    public static void main(String[] args) {

        TrafficManager tm = new TrafficManager();

        tm.enterRoundabout("CAR-1");
        tm.enterRoundabout("CAR-2");
        tm.enterRoundabout("CAR-3");
        tm.enterRoundabout("CAR-4");
        tm.enterRoundabout("CAR-5"); // goes to queue
        tm.enterRoundabout("CAR-6"); // queue overflow

        tm.printRoundabout();

        tm.exitRoundabout("CAR-2");

        tm.printRoundabout();
    }
}
