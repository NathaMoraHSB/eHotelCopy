package com.example.application.Persistence;
import com.example.application.Common.Bill;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BillingDAO implements IBillingP{

    private HikariDataSource dataSource = DbConnection.getDataSource();
    @Override
    public void newBill(Bill bill){

    }

    @Override
    public Bill getBillByID(int bookingID){
        return null;
    }

    @Override
    public double calculateMealsPrice(int bookingId){
        return 0;
    }

    @Override
    public double calculateParkingFee(int bookingId){
        return 0;
    }
}
