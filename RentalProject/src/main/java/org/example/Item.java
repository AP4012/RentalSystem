package org.example;

import java.util.Date;

public class Item {
    int id;
    String title;
    String genre;
    Date releaseDate;
    boolean isAvailable;

    public String getName() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleasedate() {
        return releaseDate;
    }

    public Item(String name, String genre, Date releaseDate, int id,boolean isAvailable) {
        this.id = id;
        this.title = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.isAvailable=isAvailable;
    }

    public void setAvailable() {
        isAvailable = true;
        return;
    }

    public boolean isavailable() {
        return isAvailable;
    }

    public int returnId() {
        return id;
    }
}
