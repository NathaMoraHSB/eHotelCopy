package com.example.application.Persistence;

import com.example.application.Common.Bill;

public interface IBillingP{
    // eHotel-62. Show billing information for a customer or booking
    // request

    void newBill(Bill bill);
    Bill getBillByID (int bookingID);


    // eHotel-63. Calculate the price for meals included in a booking
    // request
    double calculateMealsPrice(int bookingId);

    // eHotel-64. Calculate the parking fee for a booking
    // request
    double calculateParkingFee(int bookingId);
}
