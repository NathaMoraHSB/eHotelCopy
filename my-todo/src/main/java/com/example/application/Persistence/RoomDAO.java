package com.example.application.Persistence;

import com.example.application.Common.Room;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO implements IRoomP{

    private HikariDataSource dataSource=DbConnection.getDataSource();
    @Override
    public List<Room> showRoomTypePrice(String roomType){
        return null;
    }

    @Override
    public List<Room> showAllRooms() {
        List<Room> rooms = new ArrayList<>();

        try (Connection conn = dataSource.getConnection()) {
            String sql = "SELECT * FROM Rooms";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()) {
                        Room room = new Room(
                                rs.getInt("roomNumber"),
                                rs.getInt("floor"),
                                rs.getString("type"),
                                rs.getString("description"),
                                rs.getDouble("price"),
                                rs.getInt("occupancy"),
                                rs.getBoolean("smoking"),
                                rs.getBoolean("quiet"),
                                rs.getBoolean("seaView")
                        );
                        // Agregar la habitación a la lista de habitaciones
                        rooms.add(room);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener las habitaciones: " + e.getMessage());
        }

        return rooms;
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
