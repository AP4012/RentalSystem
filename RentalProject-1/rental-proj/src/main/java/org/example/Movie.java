package org.example;

import java.util.Date;

public class Movie extends Item {
    String director;
    String cast;

    public Movie(String title, String genre, String director, String cast, Date releaseDate, int ID,boolean isAvailable) {
        super(title, genre, releaseDate,ID,isAvailable);
        this.genre = genre;
        this.director = director;
        this.cast = cast;
    }


    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getID() {
        return returnId();
    }
}
