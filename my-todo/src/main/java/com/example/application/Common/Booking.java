package com.example.application.Common;

public class Booking {
    protected int bookingID;
    protected String startDate;
    protected String endDate;
    protected String status;
    protected int adultsNumber;
    protected int kidsNumber;
    protected boolean parking;
    protected int meals;
    protected String roomType;
    protected boolean nonSmoking;
    protected boolean seaView;
    protected double nightPrice;
    protected int totalPrice;
    protected Customer customer;

    public Booking(int bookingID, String startDate, String endDate, String status, int adultsNumber, int kidsNumber,
                   boolean parking, int meals, String roomType, boolean nonSmoking, boolean seaView, double nightPrice,
                   int totalPrice, Customer customer) {
        this.bookingID = bookingID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.adultsNumber = adultsNumber;
        this.kidsNumber = kidsNumber;
        this.parking = parking;
        this.meals = meals;
        this.roomType = roomType;
        this.nonSmoking = nonSmoking;
        this.seaView = seaView;
        this.nightPrice = nightPrice;
        this.totalPrice = totalPrice;
        this.customer = customer;
    }
    public int getBookingID() {
        return this.bookingID;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getAdultsNumber() {
        return this.adultsNumber;
    }

    public void setAdultsNumber(int adultsNumber) {
        this.adultsNumber = adultsNumber;
    }

    public int getKidsNumber() {
        return this.kidsNumber;
    }

    public void setKidsNumber(int kidsNumber) {
        this.kidsNumber = kidsNumber;
    }

    public boolean isParking() {
        return this.parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public int getMeals() {
        return this.meals;
    }

    public void setMeals(int meals) {
        this.meals = meals;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isNonSmoking() {
        return this.nonSmoking;
    }

    public void setNonSmoking(boolean nonSmoking) {
        this.nonSmoking = nonSmoking;
    }

    public boolean isSeaView() {
        return this.seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public double getNightPrice() {
        return this.nightPrice;
    }

    public void setNightPrice(double nightPrice) {
        this.nightPrice = nightPrice;
    }

    public Customer getCustomer() {
        return this.customer;
    }

}
