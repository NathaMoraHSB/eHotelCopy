package com.example.application.Domain.Interfaces;
import com.example.application.Common.Room;

import java.time.LocalDate;
import java.util.List;

public interface IRoomManagement {

    //eHotel-11 filterMthods (smoking, Quite location, Sea View, floor)
    List<Room> filterNonSmoking();
    List<Room> filterlocation();
    List<Room> filterSeaView();
    List<Room> filterFloor(int floor);

    List<Room> showRoomTypePrice(String roomType);

    List<Room> showAllRooms();

    // eHotel-14. Provide information about a room for a customer
    // request
    List<Room> roomInfoByCustomer(int bookingID);

    // eHotel-40. Show room numbers and their statuses
    // request
    List<Room> showRoomNumbersAndStatuses(int ocupancy);

    // eHotel-66. Show the status of a room for a specific day
    // request
    int getRoomStatus(int roomId, LocalDate date);








    /*
    //eHotel-8. Show available rooms (type, price and photo)
    List<Room> showAvailableRooms();


// void roomAssignation(int roomID, inr bookingID );
    List<Room> showRoomTypePrice(String roomType);

    List<String> showRoomImg(String roomType);

    List<Room> roomInfoByCustomer(int bookingID);

   // eHotel-40. Show room numbers and their statuses
    List<RoomStatus> showRoomNumbersAndStatuses();

    // eHotel-41. Show all requested bookings
    // request
    List<BookingRequest> showRequestedBookings();



/*
//eHotel-8. Show available rooms
    // request
    List<Room> showAvailableRooms(LocalDate startDate, LocalDate endDate);

// eHotel-9. Show room type with price and image
    // request
    RoomInfo showRoomTypePriceImg(String roomType);

 // eHotel-14. Provide information about a room for a customer
    // request
 RoomInfo getRoomInfoForCustomer(int customerId);

 // eHotel-15. Display an image given an image path or identifier
    // request
     ImageData displayImage(String imagePath);

    // Additional methods based on the provided requirements...

    // eHotel-26. Create a new booking
    // add
    void newBooking(BookingDetails bookingDetails);

    // eHotel-28. Show booking information
    // request
    BookingInfo showBookingInfo(int bookingId);

    // eHotel-30. Check booking status
    // request
    String bookingStatus(int bookingId);

    // eHotel-32. Record a new forgotten item
    // add
    void newForgottenItem(LostItem lostItem);

    // eHotel-35. Show employee name by ID
    // request
    String showEmployeeName(int employeeId);





    */

}
