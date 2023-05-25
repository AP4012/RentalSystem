package org.example;


public class Item {
    public int id;
    public String title;
    public String genre;
    public String releaseDate;
     public boolean available = true
             ;

    public Item(int id, String title, String genre, int releaseDate) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseDate = String.valueOf(releaseDate);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailable() {
        return  available;
    }
    public void  setAvailable(boolean status){
        available=status;
    }
}
