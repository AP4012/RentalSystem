package org.example;

import java.util.Date;

public class Book extends Item {
    String writer;
    String publisher;
    String bookCover;

    public Book(String title, String genre, String writer, Date releaseDate,String publisher,String bookCover, int id,boolean isAvailable ) {
        super(title, genre, releaseDate, id,isAvailable);
        this.writer = writer;
        this.publisher=publisher;
        this.bookCover=bookCover;
    }

    public String getTitle() {
        return getName();
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return writer;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getID() {
        return returnId();
    }

}
