package com.linkedlist.problem9.onlineticketreservationsystem;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    int seatNo;
    String time;
    Ticket next;

    Ticket(int id, String c, String m, int seat, String time) {
        this.ticketId = id;
        this.customerName = c;
        this.movieName = m;
        this.seatNo = seat;
        this.time = time;
    }
}
