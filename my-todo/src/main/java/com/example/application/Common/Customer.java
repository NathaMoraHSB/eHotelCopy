package com.example.application.Common;

public class Customer extends User {

    private int costumerID;
    private String email;
    private String paymentMethod;

    public Customer(String username, String password, String name, String lastname, String address, String email) {
        super(username, password, name, lastname, address);
        this.email=email;
    }


    public int getCustomerID() {
        return this.costumerID;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getCostumerID() {
        return costumerID;
    }

    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }
}