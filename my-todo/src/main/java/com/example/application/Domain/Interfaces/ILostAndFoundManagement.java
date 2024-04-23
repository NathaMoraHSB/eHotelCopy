package com.example.application.Domain.Interfaces;
import java.util.List;
import com.example.application.Common.LostItem;

public interface ILostAndFoundManagement {


    //eHotel-32

    void newLostItem(LostItem lostItem); // Both of Customer and Employee can create it

    void removeLostItem(int lostItemID);

    void updateLostItem(boolean status);


    void filterLostStatus();

    void sortLostbystatus();

 //   List <LostAndFindItem> showLostandFounds();

    List<LostItem> showAllLostItem();

    List<LostItem> showLostItemByCustomer(int customerId);


}
