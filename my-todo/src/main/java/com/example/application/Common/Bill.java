package com.example.application.Common;

public class Bill extends Booking {

    private int billNumber;
    private String date;
    private String paymentMethod;

    public Bill(int bookingID, String startDate, String endDate, String status, int adultsNumber, int kidsNumber,
                boolean parking, int meals, String roomType, boolean nonSmoking, boolean seaView, double nightPrice,
                int totalPrice, Customer customer, int billNumber, String date, String paymentMethod) {
        super(bookingID, startDate, endDate, status, adultsNumber, kidsNumber, parking, meals, roomType, nonSmoking, seaView, nightPrice, totalPrice, customer);
        this.billNumber = billNumber;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
