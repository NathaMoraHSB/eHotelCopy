package com.example.application.Common;

public class LogBook {

    private int logID;
    private String date;
    private String userName;
    private String time;
    private String initiator;
    private String event;

    public LogBook(String date, String userName, String time){

        this.logID=logID;
        this.date=date;
        this.userName=userName;
        this.time=time;
        this.initiator=initiator;
        this.event=event;

    }

    public int getLogID() {
        return logID;
    }

    public String getDate() {
        return date;
    }

    public String getUserName() {
        return userName;
    }

    public String getTime() {
        return time;
    }

    public String getInitiator() {
        return initiator;
    }

    public String getEvent() {
        return event;
    }

    @Override
    public String toString() {
        return "LogBook{" +
                "logID=" + logID +
                ", date='" + date + '\'' +
                ", userName='" + userName + '\'' +
                ", time='" + time + '\'' +
                ", initiator='" + initiator + '\'' +
                ", event='" + event + '\'' +
                '}';
    }
}
