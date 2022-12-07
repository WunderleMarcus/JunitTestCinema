package de.techstarter.cinema;

import java.time.LocalDate;

public class Ticket {

    private final String room;

    private final TimeSlot timeSlot;

    private final LocalDate date;

    private final char row;

    private final int place;

    public Ticket(String room, TimeSlot timeSlot, LocalDate date, char row, int place) {
        this.room = room;
        this.timeSlot = timeSlot;
        this.date = date;
        this.row = row;
        this.place = place;
    }

    public String getRoom() {
        return this.room;
    }

    public TimeSlot getTimeSlot() {
        return this.timeSlot;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public char getRow() {
        return this.row;
    }

    public int getPlace() {
        return this.place;
    }

}
