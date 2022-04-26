package com.hemycoo.test;

import com.hemycoo1.pojo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Vector;

public class Test1 {

    @Test
    public void test1() {
        Customer customer = new Customer();
        customer.setName("Hem");
        Vector<Rental> rentalVector = new Vector<>();
        rentalVector.add(new Rental(new Movie("The Matrix", new RegularPrice()), 2));
        rentalVector.add(new Rental(new Movie("The Matrix", new ChildrensPrice()), 3));
        customer.setRentalVector(rentalVector);
        String result = customer.statement();

        String expectedResult = "Rental Record for Hem\n" +
                "\tThe Matrix\t2.0\n" +
                "\tThe Matrix\t1.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 2 frequent renter points";
        Assertions.assertEquals(expectedResult, result);
    }

}
