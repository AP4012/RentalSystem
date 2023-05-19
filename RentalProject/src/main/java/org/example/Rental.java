package org.example;

import java.util.Date;

public class Rental {
    int id;
    Item item;
    Customer customer;
    Date rentalDate;
    Date returnDate;

    public Rental(Item item, Customer customer) {
        this.id = customer.id + item.id;
        this.item = item;
        this.customer=customer;
        item.isAvailable=false;
    }

    public int getId() {
        return id;
    }


    public Item getitem() {
        return item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double calculateLateFee() {
        return 0;
    }
}
