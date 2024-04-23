package com.example.application.Domain.Interfaces;

import com.example.application.Common.Bill;

public interface IBillingManagement {

// TODO PDF Generating

    void newBill(Bill bill);

    Bill getBillByID(int bookingID);




    // eHotel - 63

    float calculateParking();

    // eHotel - 64
    float calculateMeals();

    float totalPrice();



}
