package com.example.application.Domain;

import com.example.application.Common.Room;
import com.example.application.Domain.Interfaces.IRoomManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RoomManagement implements IRoomManagement {

    List <Room> rooms = new ArrayList<>();


    public List<Room> getFreeRooms() {
        return rooms.stream().filter((Room room) -> room.getOccupancy() == 0).collect(Collectors.toList());
    }

    public List<Room> filterNonSmoking() {
        return rooms.stream().filter(Room::isNonSmoking).collect(Collectors.toList());
    }

    public List<Room> filterlocation() {
        return rooms.stream().filter(Room::isQuite).collect(Collectors.toList());
    }

    public List<Room> maxPrice(int price) {
        return rooms.stream().filter((Room room) -> room.getPrice() <= price).collect(Collectors.toList());
    }

    public List<Room> filterSeaView() {
        return rooms.stream().filter(Room::isSeaView).collect(Collectors.toList());
    }

    public List<Room> filterFloor(int floor) {
        return rooms.stream().filter((Room room) -> room.getFloor() == floor).collect(Collectors.toList());
    }

    @Override
    public List<Room> showRoomTypePrice(String roomType){
        return null;
    }

    @Override
    public List<Room> showAllRooms(){
        return null;
    }

    @Override
    public List<Room> roomInfoByCustomer(int bookingID){
        return null;
    }

    @Override
    public List<Room> showRoomNumbersAndStatuses(int ocupancy){
        return null;
    }

    @Override
    public int getRoomStatus(int roomId, LocalDate date){
        return 0;
    }

}
