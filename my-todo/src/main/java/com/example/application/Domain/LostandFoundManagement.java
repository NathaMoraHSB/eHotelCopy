package com.example.application.Domain;

import com.example.application.Common.LostItem;
import com.example.application.Domain.Interfaces.ILostAndFoundManagement;

import java.util.List;

public class LostandFoundManagement implements ILostAndFoundManagement {


    @Override
    public void newLostItem(LostItem lostItem) {

    }

    @Override
    public void removeLostItem(int lostItemID) {

    }

    @Override
    public void updateLostItem(boolean status) {

    }

    @Override
    public void filterLostStatus() {

    }

    @Override
    public void sortLostbystatus() {

    }

    @Override
    public List<LostItem> showAllLostItem() {
        return null;
    }

    @Override
    public List<LostItem> showLostItemByCustomer(int customerId) {
        return null;
    }
}
