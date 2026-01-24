package com.FleetManager;


public class Main {

    public static void main(String[] args) {

        // Depot-wise sorted lists (conceptually)
        Vehicle[] masterList = {
            // Depot A (sorted)
            new Vehicle("DL-01", 12000),
            new Vehicle("DL-02", 18000),

            // Depot B (sorted)
            new Vehicle("MH-11", 15000),
            new Vehicle("MH-12", 22000),

            // Depot C (sorted)
            new Vehicle("KA-05", 10000),
            new Vehicle("KA-06", 20000)
        };

        MaintainenceManager scheduler =
                new MaintainenceManager(masterList);

        System.out.println("Before Merging (Depot Data):");
        scheduler.display();

        scheduler.sort();

        System.out.println("\nMaster Maintenance Schedule (Sorted by Mileage):");
        scheduler.display();
    }
}
