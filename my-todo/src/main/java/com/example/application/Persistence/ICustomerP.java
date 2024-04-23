package com.example.application.Persistence;

import com.example.application.Common.Customer;

import java.util.List;

public interface ICustomerP{
    void registerNewCustomer(Customer customer);
    //todo this can be done in domain
    Customer findCustomerByID(int customerID);

    List<Customer> getAllCustomers();


}
