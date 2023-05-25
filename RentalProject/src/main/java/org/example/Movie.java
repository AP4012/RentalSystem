package org.example;


public class Movie extends Item{
    //private String title;  از فایل اصلی باید پاک شن
    //private String genre;
    private String director;
    private String cast;
    //private boolean available;

    public Movie(String title, String genre, String director, String cast, int releaseDate, int id) {
        super(id,title,genre,releaseDate);
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
        this.releaseDate = String.valueOf(releaseDate);
        this.id=id;
        this.available = true;
    }



    public String getTitle() {
        return title;
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

    public String getReleaseDate() {
        return releaseDate;
    }


}
