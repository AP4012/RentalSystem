package university.Library;

public class Movie extends Item{
    private String id;
    private String title;
    private String genre;
    private String director;
    private String cast;
    private int releaseDate;
    private boolean available;

    public Movie(String title, String genre, String director, String cast, int releaseDate, String id) {
        super(id,title,genre,releaseDate);
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
        this.releaseDate = releaseDate;
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

    public int getReleaseDate() {
        return releaseDate;
    }


}
