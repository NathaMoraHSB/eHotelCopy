package com.example.application.Persistence;

import com.example.application.Common.LostItem;

import java.util.List;

public interface ILostAndFoundP{


    // eHotel-71. Show a list of lost and found items
// request
    List<LostItem> showAllLostItem();
    // eHotel-32. Record a new forgotten item
    // add

    // eHotel-33. Record a new forgotten item
    // eHotel-73. Add a new item to the lost and found
    // add
    void newLostItem(LostItem lostItem);
    void removeLostItem (int lostItemID);
    void updateLostItem(boolean status);

    // eHotel-74. Change the status of an item in the lost and found
    // modify
    void changeItemStatusInLostAndFound(int itemId, String newStatus);

    List<LostItem> showLostItemByCustomer(int customerID);

    // eHotel-42. Show lost and found items
    // request
    List<LostItem> showLostAndFoundItems();
}
