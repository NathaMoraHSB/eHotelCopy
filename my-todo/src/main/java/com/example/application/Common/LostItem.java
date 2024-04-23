package com.example.application.Common;

public class LostItem {

    private String description;
    private int itemID;
    private Customer customer;
    private Booking booking;
    private String status;


    public LostItem(int itemID, String description, Customer customer, Booking booking, String status) {
        this.itemID = itemID;
        this.description = description;
        this.customer = customer;
        this.booking = booking;
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemID() {
        return this.itemID;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Booking getBooking() {
        return this.booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String  getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
