package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceGenerator {

    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare() {
        CabInvoice cabInvoice = new CabInvoice();
        double actualFare = cabInvoice.calculateFare(10,50);
        Assertions.assertEquals(150,actualFare);
    }

    @Test
    public void givenMultipleRidesShouldReturnTotalFare(){
        CabInvoice cabInvoice = new CabInvoice();
        Ride[] rides = {new Ride(10,50), new Ride(5,25), new Ride(15,75)};
        double actualFare = cabInvoice.calculateFare(rides);
        Assertions.assertEquals(450,actualFare);
    }
}
