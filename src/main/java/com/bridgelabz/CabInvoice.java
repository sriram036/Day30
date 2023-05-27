package com.bridgelabz;

public class CabInvoice {
    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MINUTE = 1;
    public double calculateFare(int distance, int time) {
        return FARE_PER_KM * distance + FARE_PER_MINUTE * time;
    }
}
