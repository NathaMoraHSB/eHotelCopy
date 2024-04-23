package com.example.application.Domain;

import com.example.application.Common.Events;
import com.example.application.Common.LogBook;
import com.example.application.Domain.Interfaces.ILogBookManagement;


import java.time.LocalDateTime;
import java.util.List;
import java.util.*;

public class LogbookManagement implements ILogBookManagement {

    private List<LogBook> logBook;


    public LogbookManagement(){}
    //todo to be able to use this class in the Domain class the design of the constructor needs to be redesigned
    public LogbookManagement(List<LogBook> logBook) {
        this.logBook = logBook;
    }

    public List<LogBook> getLogBook() {
        return logBook;
    }


    public void logLoginFailed(String initiator) {
        LogBook eShopLog = new LogBook(Events.LOGIN_FAILED.toString(), String.valueOf(LocalDateTime.now()), initiator);
        logBook.add(eShopLog);
    };

   public void logCustomerReRegistered(String initiator){
        LogBook eShopLog = new LogBook(Events.CUSTOMER_RE_REGISTERED.toString(), String.valueOf(LocalDateTime.now()), initiator);
        logBook.add(eShopLog);
    };

   public void logRoomDeleted(String initiator){

        LogBook eShopLog = new LogBook(Events.ROOM_DELETED_BY_MANAGER.toString(), String.valueOf(LocalDateTime.now()), initiator);
        logBook.add(eShopLog);
    };

    public void logCheckIn(String initiator){

        LogBook eShopLog = new LogBook(Events.CHECK_IN.toString(), String.valueOf(LocalDateTime.now()), initiator);
        logBook.add(eShopLog);
    };

   public void logCheckout(String initiator){

        LogBook eShopLog = new LogBook(Events.CHECK_OUT.toString(), String.valueOf(LocalDateTime.now()), initiator);
        logBook.add(eShopLog);
    };

    public void printLogs(int lines) { // -1 = all lines
        if (lines == -1 || lines > logBook.size()) {
            lines = logBook.size();
        }
        for (int i = 0; i < lines; i++) {
            System.out.println(logBook.get(i));
        }
    }

    public void sortLogsByDate() {
        Collections.sort(logBook, Comparator.comparing(LogBook::getDate));
    }

    public void sortLogsByCause() {
        Collections.sort(logBook, Comparator.comparing(LogBook::getInitiator));
    }

    public void sortLogsByEvent() {
        Collections.sort(logBook, Comparator.comparing(LogBook::getEvent));
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
