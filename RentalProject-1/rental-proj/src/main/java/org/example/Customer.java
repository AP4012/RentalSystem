package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    int id;
    String name;
    String email;
    String phone;
    String address;
    List<Rental> rentals=new ArrayList<>();
    public Customer(String name, String email, String phone, String address, int id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String getAddress() {
        return address;
    }
}
