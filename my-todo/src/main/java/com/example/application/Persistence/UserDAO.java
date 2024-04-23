package com.example.application.Persistence;
import com.example.application.Common.User;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service

public class UserDAO implements IUserP{
    private HikariDataSource dataSource=DbConnection.getDataSource();

    public UserDAO() {
    }

    @Override
    public boolean login(String username, String password){
        System.out.println(username+"  "+password);
        try (Connection conn=dataSource.getConnection()){
            String sql="SELECT password FROM Users WHERE UserName = ?";
            System.out.println(sql);
            try (PreparedStatement pstmt=conn.prepareStatement(sql)){
                pstmt.setString(1, username);
                try (ResultSet rs=pstmt.executeQuery()){
                    if(rs.next()){
                        String retrievedPassword=rs.getString("password");
                        return password.equals(retrievedPassword);
                    }
                }
            }
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            return false;
        }
        return false;
    }

    @Override
    public int getUserID(String username){
        int userID=0;
        try (Connection conn=dataSource.getConnection()){
            String sql="SELECT userID FROM Users WHERE UserName = ?";
            try (PreparedStatement pstmt=conn.prepareStatement(sql)){
                pstmt.setString(1, username);
                try (ResultSet rs=pstmt.executeQuery()){
                    if(rs.next()){
                        userID=rs.getInt("userID");
                    }
                }
            }
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        return userID;
    }
    @Override
    public boolean isEmployee(int userID){
        try (Connection conn=dataSource.getConnection()){
            String sql="SELECT * FROM Employees WHERE userID = ?";
            try (PreparedStatement pstmt=conn.prepareStatement(sql)){
                pstmt.setInt(1, userID);
                try (ResultSet rs=pstmt.executeQuery()){
                    return rs.next(); // Si rs.next() devuelve true, significa que el usuario es empleado
                }
            }
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            return false;
        }
    }

    @Override
    public boolean isManager(int userID){

        try (Connection conn=dataSource.getConnection()){
            String sql="SELECT isManager FROM Employees WHERE userID = ?";
            try (PreparedStatement pstmt=conn.prepareStatement(sql)){
                pstmt.setInt(1, userID);
                try (ResultSet rs=pstmt.executeQuery()){
                    if(rs.next()){
                        return rs.getBoolean("isManager");
                    }
                }
            }
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }

    @Override
    public void newUser(User user){
        String sql = "INSERT INTO Users (UserName, password, name, lastName, address) VALUES (?, ?, ?, ?, ?);";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getName());
            pstmt.setString(4, user.getLastname());
            pstmt.setString(5, user.getAddress());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}