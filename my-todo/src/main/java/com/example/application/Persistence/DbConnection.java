package com.example.application.Persistence;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DbConnection{

    private static HikariDataSource dataSource;

    private DbConnection(){
    }

    static{
        HikariConfig config=new HikariConfig();
        config.setJdbcUrl("jdbc:sqlite:my-todo/eHotel.db");
        config.setDriverClassName("org.sqlite.JDBC");
        dataSource=new HikariDataSource(config);
    }

    /**
     * Gets the single instance of HikariDataSource created for database connection pooling.
     *
     * @return The static instance of HikariDataSource.
     */
    public static HikariDataSource getDataSource(){
        return dataSource;
    }
}




