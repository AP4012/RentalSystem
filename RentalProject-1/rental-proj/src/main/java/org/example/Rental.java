package org.example;

import java.util.Date;

public class Rental {
    int id;
    Item item;
    Customer customer;
    Integer customerId;
    Date rentalDate;
    Date returnDate;

    public Rental(Item item, Customer customer) {
        this.id = customer.id + item.returnId();
        this.customer= new Customer(customer.name, customer.email, customer.phone, customer.address, customer.id);
        this.item = item;
        this.customerId = customer.id;
        item.isAvailable = false;
    }

    public int getId() {
        return id;
    }


    public Item getitem() {
        return item;
    }

    public Customer getCustomer() {
        RentalStore rentalStore = new RentalStore();
        return rentalStore.getCustomerById(customerId);
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
