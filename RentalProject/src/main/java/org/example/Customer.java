package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private String address;
    private int id;
    public ArrayList<Rental> rentals;


    public Customer(String name, String email, String phone, String address, int id) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.id = id;
        rentals=new ArrayList<>();

    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }



    public String getAddress() {
        return this.address;
    }
    public void setRentals(ArrayList<Rental> rentals) {

        this.rentals = rentals;
    }
    public ArrayList<Rental>getRentals(){
        return rentals;
        }






    public void addRental(Rental rental) {
        if (rentals==null)
            rentals=new ArrayList<>();
        rentals.add(rental);
    }
}

