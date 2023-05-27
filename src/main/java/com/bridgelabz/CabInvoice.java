package com.bridgelabz;

public class CabInvoice {
    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MINUTE = 1;
    public double calculateFare(int distance, int time) {
        return FARE_PER_KM * distance + FARE_PER_MINUTE * time;
    }

    public double calculateFare(Ride[] rides) {
        double aggregateFare = 0;
        for (Ride ride : rides) {
            double totalFare = calculateFare(ride.distance,ride.time);
            aggregateFare = aggregateFare + totalFare;
        }
        return aggregateFare;
    }

    public Invoice generateInvoice(Ride[] rides) {
        int totalNumberOfRides = rides.length;
        double totalFare = calculateFare(rides);
        double averageFare = totalFare / totalNumberOfRides;
        Invoice invoice = new Invoice(totalNumberOfRides,totalFare,averageFare);
        return invoice;
    }
}
