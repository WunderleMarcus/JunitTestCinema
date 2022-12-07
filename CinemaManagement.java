package de.techstarter.cinema;

import java.util.LinkedList;
import java.util.List;

public class CinemaManagement {

    private final List<Show> shows = new LinkedList<>();

    public void scheduleAShow(Show show) {
        if (this.shows.contains(show)) {
            throw new IllegalArgumentException("Die Vorstellung ist bereits eingeplant");
        }
        this.shows.add(show);
    }

    public List<Show> getShows() {
        return this.shows;
    }

    public Ticket buyTicket(Show show, char row, int place, float money) {
        return show.buyTicket(row, place, money);
    }

}