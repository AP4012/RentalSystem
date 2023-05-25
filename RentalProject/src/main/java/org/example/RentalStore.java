package org.example;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalStore {
    private static List<Item> items;
    private  static List<Customer> customers;

    public static ArrayList<Rental> rentalList = new ArrayList<>();





    public RentalStore() {
        this.items= new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void register(Customer customer) {
        this.customers.add(customer);
    }

    public void addMovie(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public List<Item> getAvailableItems() {
        List<Item> availableItem = new ArrayList<>();
        for (Item item : this.items) {
            if (item.isAvailable()) {
                availableItem.add(item);
            }
        }
        return availableItem;
    }

    public void rentItem(Item item, Customer customer) {
        if (item.isAvailable()) {
            int rentalId=0;
            Rental rental = new Rental(item, customer, rentalId++);
            item.setAvailable(false);
            customer.addRental(rental);
        }
    }

    public void returnItem(Rental rental) {
        rental.getItem().setAvailable(true);
        rental.setReturnDate(new Date());
    }

    public Customer getCustomerById(int id) {
        for (Customer customer : this.customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public Item getItemById(int id) {
        for (Item item : this.items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
