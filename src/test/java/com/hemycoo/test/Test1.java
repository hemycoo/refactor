package com.hemycoo.test;

import com.hemycoo1.pojo.Customer;
import com.hemycoo1.pojo.Movie;
import com.hemycoo1.pojo.Rental;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Vector;

public class Test1 {

    @Test
    public void test1() {
        Customer customer = new Customer();
        customer.setName("Hem");
        Vector<Rental> rentalVector = new Vector<>();
        rentalVector.add(new Rental(new Movie("The Matrix", 0), 2));
        rentalVector.add(new Rental(new Movie("The Matrix", 0), 3));
        customer.setRentalVector(rentalVector);
        String result = customer.statement();

        String expectedResult = "Rental Record for Hem\n" +
                "\tThe Matrix\t2.0\n" +
                "\tThe Matrix\t3.5\n" +
                "Amount owed is 5.5\n" +
                "You earned 2 frequent renter points";
        Assertions.assertEquals(expectedResult, result);
    }

}
