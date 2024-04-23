package com.example.application.Domain.Interfaces;

import com.example.application.Common.Customer;

import java.util.List;

public interface ICustomerManagement {


    boolean login(String username, String password);

    Customer findCustomerById(int customerId);

    boolean freeUsername(String username);

    boolean freeEmail(String email);

    void registerNewCustomer(Customer customer);
    List<Customer> getAllCustomers();

}






