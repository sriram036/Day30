package com.bridgelabz;

import java.util.Objects;

public class Invoice {
    int numberOfRides;
    double totalFare;
    double averageFare;

    public Invoice(int numberOfRides, double totalFare, double averageFare) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFare = averageFare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return numberOfRides == invoice.numberOfRides && Double.compare(invoice.totalFare, totalFare) == 0 && Double.compare(invoice.averageFare, averageFare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfRides, totalFare, averageFare);
    }
}
