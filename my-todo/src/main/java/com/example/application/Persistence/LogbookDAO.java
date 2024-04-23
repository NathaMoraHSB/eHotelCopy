package com.example.application.Persistence;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.example.application.Common.LogBook;
import java.util.List;

public class LogbookDAO implements ILogbookP{

    private HikariDataSource dataSource = DbConnection.getDataSource();
    @Override
    public void newLogbookEntry(LogBook logBook){

    }

    @Override
    public List<LogBook> showLogbookEntries(){
        return null;
    }

    @Override
    public List<LogBook> showLogbookByUserID(){
        return null;
    }

    @Override
    public List<LogBook> showLogbookByEvent(){
        return null;
    }
}
