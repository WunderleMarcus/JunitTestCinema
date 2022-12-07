package de.techstarter.cinema;

import java.util.Map;

public class CinemaAuditorium {

    private final String name;

    private final Map<Character, Integer> rows;

    public CinemaAuditorium(String name, Map<Character, Integer> rows) {
        this.name = name;
        this.rows = rows;
    }

    public String getName() {
        return this.name;
    }

    boolean checkPlace(char reihe, int place) {
        Integer places = rows.get(reihe);
        if (places == null || place > places || place == 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CinemaAuditorium)) {
            return false;
        }
        return this.name.equals(((CinemaAuditorium) obj).getName());
    }

}
