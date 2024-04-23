package com.example.application.Persistence;

import com.example.application.Common.Booking;

import java.util.List;

public interface IBookingP{

    void addActualCheckIn(int bookingId, String checkInTime);
    void addActualCheckOut(int bookingId, String checkOutTime);
    List<Booking> allBookings();
    void changeBookingStatus(int bookingID);
    Booking getBookingByID(int bookingId);
    void newBooking(int customerID, Booking booking);
    void roomAssignation(int roomID, int bookingID);
    List<Booking> showArrivalsToday(String date);
    List<Booking> showBookingsByCustomer(int userID);
    List<Booking> showDeparturesToday(String date);
    List<Booking> showRequestedBookings();

}
