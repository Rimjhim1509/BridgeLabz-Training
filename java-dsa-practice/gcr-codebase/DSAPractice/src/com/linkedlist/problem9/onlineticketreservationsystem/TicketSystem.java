package com.linkedlist.problem9.onlineticketreservationsystem;

class TicketSystem {
    Ticket head = null;

    void addTicket(int id, String c, String m, int seat, String time) {
        Ticket t = new Ticket(id, c, m, seat, time);

        if (head == null) {
            head = t;
            t.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = t;
            t.next = head;
        }
    }

    void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customerName +
                    " " + temp.movieName + " Seat:" + temp.seatNo);
            temp = temp.next;
        } while (temp != head);
    }

    int countTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}
