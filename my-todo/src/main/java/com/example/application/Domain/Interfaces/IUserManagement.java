package com.example.application.Domain.Interfaces;

import com.example.application.Common.User;

public interface IUserManagement {

    User searchUserByUsername(String username);

    // eHotel-5. Login action
    User login(String username, String password);

    // eHotel-4. Register a new customer
    boolean registerCustomer(String username, String password, String name, String lastname, String address, String email, String paymentMethod);

    // eHotel-5. Logout action

    void logout();

   //todo IuserManager should have this method it it is in the DomainInterface
    int getUserID(String username);


}
