package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalStore {
    List<Book> books = new ArrayList<>();
    List<Movie> movies = new ArrayList<>();
    List<Game> games = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();

    public void Register(Customer customer) {
        if (!(customers.contains(customer))) customers.add(customer);
    }

    /////////////////////////////////////////////////////
    public void addMovies(Item item) {
        if (item instanceof Movie) {
            movies.add((Movie) item);
        } else if (item instanceof Book) {
            books.add((Book) item);
        } else if (item instanceof Game) {
            games.add((Game) item);
        }
    }

    public void removeMovies(Item item) {
        if (item instanceof Movie) {
            movies.remove((Movie) item);
        }
        else if (item instanceof Book) {
            books.remove((Book) item);
        }
        else if (item instanceof Game) {
            games.remove((Game) item);
        }
    }
////////////////////////////////////////////////////
    public List<Movie> getAvailableMovie() {
        List<Movie> availableList = null;
        for (Movie i : movies) {
            if (i.isavailable()) {
                availableList.add(i);
            }
        }
        return availableList;
    }

    public List<Book> getAvailableBook() {
        List<Book> availableList = null;
        for (Book i : books) {
            if (i.isavailable()) {
                availableList.add(i);
            }
        }
        return availableList;
    }

    public List<Game> getAvailableGame() {
        List<Game> availableList = null;
        for (Game i : games) {
            if (i.isavailable()) {
                availableList.add(i);
            }
        }
        return availableList;
    }
///////////////////////////////////////////////////

    public static void rentItem(Item item, Customer customer) {
        if (item instanceof Movie || item instanceof Book || item instanceof Game) {
            Rental rental = new Rental(item, customer);


                if (customer.rentals == null) {
                customer.rentals = new ArrayList<>();
            }
            if (!(customer.rentals.contains(rental.item))) {
                customer.rentals.add(rental);
                rental.rentalDate = new Date();

            }

        }
        }
    //////////////////////////////////////////////

    public static void returnItem(Rental rental) {
        rental.rentalDate = new Date();
        rental.item.setAvailable();
        return;
    }

//////////////////////////////////////////////////////////
    public Customer getCustomerById(int id) {
        for (Customer i :
                customers) {
            if (id == i.id) {
                return i;
            }
        }
        return null;
    }

    public Item getMovieById(int id) {
        for (Movie i :
                movies) {
            if (id == i.returnId()) {
                Item item = (Movie) i;
                return item;
            }
        }
        return null;
    }
    public Item getBookById(int id) {
        for (Book i :
                books) {
            if (id == i.returnId()) {
                Item item = (Book) i;
                return item;
            }
        }
        return null;
    }
    public Item getGameById(int id) {
        for (Game i :
                games) {
            if (id == i.returnId()) {
                Item item = (Game) i;
                return item;
            }
        }
        return null;
    }
    }


