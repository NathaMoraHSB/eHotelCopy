package com.example.application.Domain;

import com.example.application.Common.Bill;
import com.example.application.Domain.Interfaces.IBillingManagement;

public class BillingManagement implements IBillingManagement {
    @Override
    public void newBill(Bill bill) {

    }

    @Override
    public Bill getBillByID(int bookingID){
        return null;
    }

    @Override
    public float calculateParking() {
        return 0;
    }

    @Override
    public float calculateMeals() {
        return 0;
    }

    @Override
    public float totalPrice() {
        return 0;
    }
}
