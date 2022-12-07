package de.techstarter.cinema;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Show {

    private final CinemaAuditorium room;

    private final TimeSlot timeSlot;

    private final LocalDate date;

    private final String movie;

    private final float price;

    private final List<Ticket> tickets = new LinkedList<>();

    public Show(CinemaAuditorium room, TimeSlot timeSlot, LocalDate date, String movie, float price) {
        this.room = room;
        this.timeSlot = timeSlot;
        this.date = date;
        this.movie = movie;
        this.price = price;
    }

    public String getMovie() {
        return this.movie;
    }

    public CinemaAuditorium getRoom() {
        return this.room;
    }

    public TimeSlot getTimeSlot() {
        return this.timeSlot;
    }

    public LocalDate getDate() {
        return this.date;
    }

    Ticket buyTicket(char row, int place, float money) {
        if (money < this.price) {
            throw new IllegalArgumentException("Nicht ausreichend Geld.");
        }
        if (!this.room.checkPlace(row, place)) {
            throw new IllegalArgumentException("Der Platz " + row + place + " existiert nicht.");
        }
        if (this.tickets.stream().anyMatch(ticket -> ticket.getRow() == row && ticket.getPlace() == place)) {
            throw new IllegalStateException("Der Platz " + row + place + " ist bereits belegt.");
        }
        Ticket ticket = new Ticket(this.room.getName(), this.timeSlot, this.date, row, place);
        this.tickets.add(ticket);
        return ticket;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Show)) {
            return false;
        }
        Show otherV = (Show) obj;
        return this.room.equals(otherV.getRoom()) && this.timeSlot == otherV.getTimeSlot() && this.date.isEqual(otherV.getDate());
    }

}