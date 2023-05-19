package org.example;

import java.util.Date;
//      "gameRate": 9,
//              "aboutGame": "Embark on an epic adventure as Link",
//              "manufacturer": "Nintendo"
public class Game extends Item {
    String company;
    String aboutGame;
    String director;
    double gameRate;

    public Game(String title, String genre, String company, Date releaseDate, int id,boolean isAvailable,String aboutGame,String director,double gameRate) {
        super(title, genre, releaseDate, id,isAvailable);
        this.company = company;
        this.aboutGame=aboutGame;
        this.director=director;
        this.gameRate=gameRate;
    }

    public String getName() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getId() {
        return returnId();
    }

}
