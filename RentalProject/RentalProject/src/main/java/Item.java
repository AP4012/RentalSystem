
import java.util.*;
public class Item {

        private String title;
        private String genre;
        private Date releaseDate;
        protected double rentalFee;
        private long id;

        public Item( String title, String genre, Date releaseDate, double rentalFee , long id) {

            this.title = title;
            this.genre = genre;
            this.releaseDate = releaseDate;
            this.rentalFee = rentalFee;
            this.id = id;
        }

        public long getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getGenre() {
            return genre;
        }

        public Date getReleaseDate() {
            return releaseDate;
        }

        public double getRentalFee() {
            return rentalFee;
        }

}
