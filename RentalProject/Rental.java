package university.Library;

import java.util.Date;

public class Rental {
    private Item item;
    private Customer customer;
    private int id;
    private Date rentalDate;
    private Date returnDate;

    public Rental(Item item, Customer customer, int id) {
        this.item = item;
        this.customer = customer;
        this.id = id;
        this.rentalDate = new Date();
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

    public Date getRentalDate() {
        return this.rentalDate;
    }

    public Date getReturnDate() {
        return this.returnDate;
    }

    public void setReturnDate(Date date) {
        this.returnDate = date;
    }

    public Item calculateLateFee() {
        return null;
    }
}