package com.Trafficmanager;
import java.util.*;

class TrafficManager {

    Vehicle head = null;
    Queue<Vehicle> waitingQueue = new LinkedList<>();
    int maxWaiting = 3; // queue capacity

    // Add vehicle to roundabout
    void enterRoundabout(String number) {

        Vehicle vehicle = new Vehicle(number);

        // If roundabout empty
        if (head == null) {
            head = vehicle;
            vehicle.next = head;
            System.out.println(number + " entered roundabout.");
            return;
        }

        // If roundabout has space
        if (countVehicles() < 4) {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = vehicle;
            vehicle.next = head;
            System.out.println(number + " entered roundabout.");
        } 
        // Otherwise go to waiting queue
        else {
            if (waitingQueue.size() < maxWaiting) {
                waitingQueue.offer(vehicle);
                System.out.println(number + " added to waiting queue.");
            } else {
                System.out.println("Queue Overflow! " + number + " cannot enter.");
            }
        }
    }

    // Remove vehicle from roundabout
    void exitRoundabout(String number) {

        if (head == null) {
            System.out.println("Roundabout empty.");
            return;
        }

        Vehicle curr = head, prev = null;

        do {
            if (curr.number.equals(number)) {

                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        head = head.next;
                    }
                    if (prev != null)
                        prev.next = curr.next;
                    else {
                        Vehicle last = head;
                        while (last.next != curr)
                            last = last.next;
                        last.next = head;
                    }
                }

                System.out.println(number + " exited roundabout.");

                // Move waiting vehicle if exists
                if (!waitingQueue.isEmpty()) {
                    Vehicle v = waitingQueue.poll();
                    enterRoundabout(v.number);
                }
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println(number + " not found.");
    }

    // Count vehicles in roundabout
    int countVehicles() {
        if (head == null) return 0;

        int count = 1;
        Vehicle temp = head.next;
        while (temp != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Print roundabout state
    void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.print("Roundabout: ");
        Vehicle temp = head;
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
