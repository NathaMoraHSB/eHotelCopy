package com.example.application.Domain.Interfaces;

import com.example.application.Common.LogBook;

import java.util.List;

public interface ILogBookManagement{


    List<LogBook> getLogBook();

    void logLoginFailed(String initiator);

    void logCustomerReRegistered(String initiator);

    void logRoomDeleted(String initiator);

    void logCheckIn(String initiator);

    void logCheckout(String initiator);

    void printLogs(int lines);

    void sortLogsByDate();

    void sortLogsByCause();

    void sortLogsByEvent();

    List<LogBook> showLogbookEntries();

    List<LogBook> showLogbookByUserID();

    List<LogBook> showLogbookByEvent();

}























