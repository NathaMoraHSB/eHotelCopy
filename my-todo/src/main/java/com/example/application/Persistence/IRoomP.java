package com.example.application.Persistence;

import com.example.application.Common.Room;

import java.time.LocalDate;
import java.util.List;

public interface IRoomP{


//eHotel-8. Show available rooms for the general view
//type, price and picture
// request

    // eHotel-9. Show room type with price and image
// request
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
}
