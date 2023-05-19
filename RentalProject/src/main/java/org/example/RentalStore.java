package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalStore {
    List<Item> items;

    List<Customer> customers;

    public void Register(Customer customer) {
        customers.add(customer);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getAvailableItem() {
        List<Item> availableList = null;
        for (Item i : items) {
            if (i.isavailable()) {
                availableList.add(i);
            }
        }
        return availableList;
    }

    public static void rentItem(Item item, Customer customer) {
        Rental rental = new Rental(item, customer);
        rental.rentalDate = new Date();
        System.out.println();
        if (customer.rentals == null) {
            customer.rentals = new ArrayList<>();
        }
        customer.rentals.add(rental);

    }

    public static void returnItem(Rental rental) {
        rental.rentalDate = new Date();
        rental.item.setAvailable();
        return;
    }


    public Customer getCustomerById(int id) {
        for (Customer i :
                customers) {
            if (id == i.id) {
                return i;
            }
        }
        return null;
    }

    public Item getItemById(int id) {
        for (Item i :
                items) {
            if (id == i.returnId()) {
                return i;
            }
        }
        return null;
    }
}

