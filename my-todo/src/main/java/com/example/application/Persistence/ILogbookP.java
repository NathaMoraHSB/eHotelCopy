package com.example.application.Persistence;

import com.example.application.Common.LogBook;

import java.util.List;

public interface ILogbookP{
    void newLogbookEntry (LogBook logBook);

    //todo What does it mean initiator in the Logbook context?? the user

    List<LogBook> showLogbookEntries();
    List<LogBook> showLogbookByUserID();

    List<LogBook> showLogbookByEvent();
}
