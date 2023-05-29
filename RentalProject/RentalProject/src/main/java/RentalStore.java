import java.util.ArrayList;

public class RentalStore {
    public static ArrayList<Customer> memberC = new ArrayList<>();
    public static ArrayList<Movie> movieList = new ArrayList<>();
    public static ArrayList<Game> gameList = new ArrayList<>();
    public static ArrayList<Book> bookList = new ArrayList<>();
    public static ArrayList<Rental> rentalList = new ArrayList<>();

    public static void register(Customer customer) {
        memberC.add(customer);
    }

    public static void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public static void addGame(Game game) {
        gameList.add(game);
    }

    public static void addBook(Book book) {
        bookList.add(book);
    }

    public static void removeMovie(Movie movie) {
        if (movie.isAvailableForRent())
            movieList.remove(movie);
        else {
            System.out.println("it's not available");
        }
    }

    public static void getAvailableMovies() {
        System.out.println("Here is list of available movies for rent: ");
        int i = 1;
        for (Movie movie : movieList) {
            if (movie.isAvailableForRent())
                System.out.println(
                        i + ". " + movie.getTitle() + " by " + movie.getDirector() + " and it's genre is " + movie.getGenre());
            i++;
        }
    }

    public static void getAvailableGames() {
        System.out.println("Here is list of available Games for rent: ");
        int i = 1;
        for (Game game : gameList) {
            if (game.isAvailableForRent())
                System.out.println(
                        i + ". " + game.getTitle() + " by " + game.getPublisher() + " and it's genre is " + game.getGenre());
            i++;
        }
    }

    public static void getAvailableBooks() {
        System.out.println("Here is list of available Books for rent: ");
        int i = 1;
        for (Book book : bookList) {
            if (book.isAvailableForRent())
                System.out.println(
                        i + ". " + book.getTitle() + " by " + book.getAuthor() + " and it's genre is " + book.getGenre());
            i++;
        }
    }

    public static void rentMovie(Movie movie, Customer customer) {
        String id = Long.toString(movie.getId()) + Long.toString(customer.getId());
        long castid = Long.parseLong(id);
        if (movie.isAvailableForRent()) {
            rentalList.add(new Rental(movie, customer, castid));
            System.out.println(movie.getTitle() + " rented");
        }
        else{
            System.out.println("this movie \"" + movie.getTitle() +"\" has been rented by another one and it's not available");
        }
    }

    public static void returnMovie(Rental rental) {
        Movie tempMovie = rental.getMovie();
        tempMovie.isAvailableForRent();
    }

    public static void rentBook(Book book, Customer customer) {
        String id = Long.toString(book.getId()) + Long.toString(customer.getId());
        long castid = Long.parseLong(id);
        if (book.isAvailableForRent()) {
            Rental rental = new Rental(book, customer, castid);
            rentalList.add(rental);
            customer.addRent(rental);
            System.out.println(book.getTitle() + " rented");
        }
        else{
            System.out.println("this book \"" + book.getTitle() +"\" has been rented by another one and it's not available");
        }
    }

    public static void returnBook(Rental rental) {
        Book tempBook = rental.getBook();
        tempBook.isAvailableForRent();
    }

    public static void rentGame(Game game, Customer customer) {
        String id = Long.toString(game.getId()) + Long.toString(customer.getId());
        long castid = Long.parseLong(id);
        if (game.isAvailableForRent()) {
            rentalList.add(new Rental(game, customer, castid));
            System.out.println(game.getTitle() + " rented");
        }
        else{
            System.out.println("this game \""+game.getTitle() + "\" has been rented by another one and it's not available");
        }
    }

    public static void returnGame(Rental rental) {
        Game tempGame = rental.getGame();
        tempGame.isAvailableForRent();
    }

    public static Customer getCustomerById(long id) {
        Customer tempCustomer = null;
        Boolean isExisted = false;
        for (Customer temp : memberC) {
            if (temp.getId() == id) {
                tempCustomer = temp;
                isExisted = true;
            }
        }
        if (!isExisted) {
            System.out.println("we don't have any user with this id");
        } else {
            System.out.println("user name is " + tempCustomer.getName());
            System.out.println("user email is " + tempCustomer.getEmail());
            System.out.println("user phone is " + tempCustomer.getPhone());
            tempCustomer.getRentals();
        }
        return tempCustomer;
    }

    public static Movie getMovieById(long id) {
        Movie tempMovie = null;
        Boolean isExisted = false;
        for (Movie temp : movieList) {
            if (temp.getId() == id) {
                tempMovie = temp;
                isExisted = true;
            }
        }
        if (!isExisted) {
            System.out.println("we don't have any movie with this id");
        } else {
            System.out.println("movie title is " + tempMovie.getTitle());
            System.out.println("movie director is " + tempMovie.getDirector());
            System.out.println("movie genre is " + tempMovie.getGenre());
            System.out.println("movie cast is " + tempMovie.getCast());
        }
        return tempMovie;
    }

}
