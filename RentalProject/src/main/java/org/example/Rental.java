package org.example;


import java.util.Date;

public class Rental {
    private Item item;
    private Customer customer;
    private int id;
    public Date rentalDate=new Date();
    public Date returnDate;

    public Rental(Item item, Customer customer, int id) {
        this.item = item;
        this.customer = new Customer(customer.getName(), customer.getEmail(), customer.getPhone(), customer.getAddress(), customer.getId());
        this.id = id;
        this.rentalDate=new Date();
    }

    public int getId() {
        return this.id;
    }

    public Item getItem() {
        return this.item;
    }

    public Customer getCustomer() {
        return this.customer;
    }
    public Date getRentalDate(){return this.rentalDate;}

    public Date getReturnDate() {
        return this.returnDate;
    }
    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public void setReturnDate(Date date) {
        this.returnDate = date;
    }

    public Item calculateLateFee() {
        return null;
    }
}