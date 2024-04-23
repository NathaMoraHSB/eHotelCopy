package com.example.application.Common;

public class Room {

    private int roomNumber;
    private int floor;
    private String type;
    private String  description;
    private String  view;
    private double price;
    private int occupancy;

    private boolean nonSmoking; //Filter
    private boolean quite; //Filter
    private boolean seaView; //Filter

    public Room(int roomNumber, int floor, String type, String description, double price, int occupancy, boolean nonSmoking, boolean quite, boolean seaView) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.type = type;
        this.description = description;
        this.price = price;
        this.occupancy = occupancy;
        this.nonSmoking = nonSmoking;
        this.quite = quite;
        this.seaView = seaView;
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getFloor() {
        return this.floor;
    }

    public String  getType() {
        return this.type;
    }

    public String  getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }


    public String getView() {
        return view;
    }

    public boolean isNonSmoking() {
        return nonSmoking;
    }

    public boolean isQuite() {
        return quite;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setNonSmoking(boolean smoking){
    }

    public void setQuite(boolean quiet){
    }

    public void setSeaView(boolean seaView){
    }

    public void setDescription(String description){
    }

    public void setType(String type){
    }

    public void setFloor(int floor){
    }

    public void setRoomNumber(int roomNumber){
    }


}
