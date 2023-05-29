
import java.util.*;

    public class Movie extends Item {
        private final String director;
        private final String cast;
        private boolean availableForRent;

        public Movie(String title, String genre, Date releaseDate, double rentalFee, String director, String cast, long id) {
            super(title, genre, releaseDate, rentalFee, id);
            this.director = director;
            this.cast = cast;
            this.availableForRent = true;
        }

        public String getDirector() {
            return director;
        }

        public String getCast() {
            return cast;
        }

        public boolean isAvailableForRent() {
            return availableForRent;
        }

        public void setAvailableForRent(boolean availableForRent)
        {
            this.availableForRent = availableForRent;
        }

    }
