package university.Library;

public class Item {
    public String id;
    public String title;
    public String genre;
    public int releaseDate;
     public boolean available = true;

    public Item(String id, String title, String genre, int releaseDate) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailable() {
        return  available;
    }
    public boolean setAvailable(boolean status){
        return  available;
    }
}
