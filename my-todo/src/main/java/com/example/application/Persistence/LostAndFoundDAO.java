package com.example.application.Persistence;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.example.application.Common.LostItem;
import java.util.List;

public class LostAndFoundDAO implements ILostAndFoundP{
    private HikariDataSource dataSource = DbConnection.getDataSource();
    @Override
    public List<LostItem> showAllLostItem(){
        return null;
    }

    @Override
    public void newLostItem(LostItem lostItem){

    }

    @Override
    public void removeLostItem(int lostItemID){

    }

    @Override
    public void updateLostItem(boolean status){

    }

    @Override
    public void changeItemStatusInLostAndFound(int itemId, String newStatus){

    }

    @Override
    public List<LostItem> showLostItemByCustomer(int customerID){
        return null;
    }

    @Override
    public List<LostItem> showLostAndFoundItems(){
        return null;
    }
}
