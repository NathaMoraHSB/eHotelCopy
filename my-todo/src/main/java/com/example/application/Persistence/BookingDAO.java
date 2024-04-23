package com.example.application.Persistence;
import com.example.application.Common.Booking;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class BookingDAO implements IBookingP{

    private HikariDataSource dataSource = DbConnection.getDataSource();
    @Override
    public List<Booking> allBookings(){
        return null;
    }

    @Override
    public void roomAssignation(int roomID, int bookingID){

    }

    @Override
    public void newBooking(int customerID, Booking booking){

    }

    @Override
    public Booking getBookingByID(int bookingId){
        return null;
    }

    @Override
    public List<Booking> showBookingsByCustomer(int userID){
        return null;
    }

    @Override
    public void changeBookingStatus(int bookingID){

    }

    @Override
    public void addActualCheckIn(int bookingId, String checkInTime){

    }

    @Override
    public void addActualCheckOut(int bookingId, String checkOutTime){

    }

    @Override
    public List<Booking> showRequestedBookings(){
        return null;
    }

    @Override
    public List<Booking> showArrivalsToday(String date){
        return null;
    }

    @Override
    public List<Booking> showDeparturesToday(String date){
        return null;
    }
}
