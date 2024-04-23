package com.example.application.Common;

public class Employee extends User {
    protected int employeeId;
    private String workEmail;


    public Employee(String username, String password, String firstName, String lastName, String address, String workEmail) {
        super(username, password, firstName,lastName, address);
        this.employeeId = this.getUserId(); // Assuming unique user ID is sufficient as employee ID
        this.workEmail = workEmail;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }
}
