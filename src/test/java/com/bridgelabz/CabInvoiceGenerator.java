package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceGenerator {

    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare() {
        CabInvoice cabInvoice = new CabInvoice();
        double actualCost = cabInvoice.calculateFare(10,50);
        Assertions.assertEquals(150,actualCost);
    }
}
