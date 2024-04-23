package com.example.application.Domain.Interfaces;

import java.util.List;

import com.example.application.Common.Booking;

public interface IBookingManagement{


    void createBooking();

    void bookinValidation(); // Domain


    //eHotel-29 und eHotel 50 in Booking an manager


    void newBooking(int customerID, Booking booking);
//void newBooking(String startDate, String endDate, int adults, int kids, boolean parking, int customerID);


    List<Booking> allBookings();

    List<Booking> showBookingbyCustomer(int userID);

    Booking showBookingInfo(int bookingID);

    Booking getBookingByID(int bookingId);

    void changeBookingStatus(int bookingID);

    void addActualCheckOut(int bookingId, String checkOutTime);

    void addActualCheckIn(int bookingId, String checkInTime);

    void roomAssignation(int roomID, int bookingID);

    List<Booking> showArrivalsToday(String date);

    List<Booking> showDeparturesToday(String date);

    List<Booking> showRequestedBookings();
//float totalPriceBooking(float nightPrice, )

    // eHotel-38. Show all arrivals for today

    // List<BookingInfo> showArrivalsToday();

    // eHotel-39. Show all departures for today

    // List<BookingInfo> showDeparturesToday();


}
