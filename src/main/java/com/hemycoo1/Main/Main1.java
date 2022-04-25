package com.hemycoo1.Main;

import com.hemycoo1.pojo.Customer;
import com.hemycoo1.pojo.Movie;
import com.hemycoo1.pojo.Rental;

import java.util.Vector;

public class Main1 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Hem");
        Vector<Rental> rentalVector = new Vector<>();
        rentalVector.add(new Rental(new Movie("The Matrix", 0), 2));
        rentalVector.add(new Rental(new Movie("The Matrix", 0), 3));
        customer.setRentalVector(rentalVector);
        String statement = customer.statement();
        System.out.println(statement);
    }

}
