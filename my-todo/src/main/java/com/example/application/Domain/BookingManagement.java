package com.example.application.Domain;

import com.example.application.Common.Booking;
import com.example.application.Domain.Interfaces.IBookingManagement;

import java.util.List;

public class BookingManagement implements IBookingManagement {
    @Override
    public void createBooking() {

    }

    @Override
    public void bookinValidation() {

    }

    @Override
    public void newBooking(int customerID, Booking booking){

    }


    /**
    @Override
    public void newBooking(String startDate, String endDate, int adults, int kids, boolean parking, int customerID) {

    } **/

    @Override
    public List<Booking> allBookings() {
        return null;
    }

    @Override
    public List<Booking> showBookingbyCustomer(int userID) {
        return null;
    }

    @Override
    public Booking showBookingInfo(int bookingID) {
        return null;
    }

    @Override
    public Booking getBookingByID(int bookingId){
        return null;
    }

    @Override
    public void changeBookingStatus(int bookingID) {

    }

    @Override
    public void addActualCheckOut(int bookingId, String checkOutTime){

    }

    @Override
    public void addActualCheckIn(int bookingId, String checkInTime){

    }

    @Override
    public void roomAssignation(int roomID, int bookingID){

    }

    @Override
    public List<Booking> showArrivalsToday(String date){
        return null;
    }

    @Override
    public List<Booking> showDeparturesToday(String date){
        return null;
    }

    @Override
    public List<Booking> showRequestedBookings(){
        return null;
    }
}
