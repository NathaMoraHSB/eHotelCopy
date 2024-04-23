package com.example.application.Persistence;
import com.example.application.Common.Customer;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerP{

    private HikariDataSource dataSource = DbConnection.getDataSource();
    @Override
    public void registerNewCustomer(Customer customer){

    }

    @Override
    public Customer findCustomerByID(int customerID){
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();

        try (Connection conn = dataSource.getConnection()) {
            String sql = "SELECT Users.UserName, Users.password, Users.name, Users.lastName, Users.address, Customers.email " +
                    "FROM Users " +
                    "LEFT JOIN Customers ON Users.userID = Customers.userID " +
                    "WHERE Customers.userID IS NOT NULL";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()) {
                        Customer customer = new Customer(
                                rs.getString("UserName"),
                                rs.getString("password"),
                                rs.getString("name"),
                                rs.getString("lastName"),
                                rs.getString("address"),
                                rs.getString("email")
                        );
                        customers.add(customer);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return customers;
    }
}
