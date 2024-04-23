package com.example.application.Common;

public class User {

    protected int userId;


    protected String username;
    protected String password;
    protected String name;
    protected String lastname;
    protected String address;



    public User(String username, String password, String name, String lastname, String address) {
        this.userId = 0;
        this.username = username;
        this.password = password;
        this.name= name;
        this.address=address;
        this.lastname=lastname;
    }


    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
