package com.example.application.Domain;

import com.example.application.Common.Customer;
import com.example.application.Domain.Interfaces.ICustomerManagement;

import java.util.ArrayList;
import java.util.List;

public class CustomerManagement implements ICustomerManagement {

    private List<Customer> customerList = new ArrayList<>();


    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public Customer findCustomerById(int customerId) {
        return null;
    }

    @Override
    public boolean freeUsername(String username) {
        return false;
    }

    @Override
    public boolean freeEmail(String email) {
        return false;
    }

    @Override
    public void registerNewCustomer(Customer customer){

    }

    @Override
    public List<Customer> getAllCustomers(){
        return null;
    }


}
