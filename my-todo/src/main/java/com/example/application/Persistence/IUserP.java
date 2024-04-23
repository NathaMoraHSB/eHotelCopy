package com.example.application.Persistence;

import com.example.application.Common.User;

public interface IUserP{

    boolean login(String username, String password);
    int getUserID(String username);
    boolean isEmployee(int userID);
    boolean isManager(int userID);
    public void newUser(User user);

    // eHotel-5. Login action
    // request
   // boolean login(String username, String password);
}
