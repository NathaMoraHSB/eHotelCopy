package com.example.application.Domain;

import com.example.application.Common.Employee;
import com.example.application.Domain.Interfaces.IEmployeeManagement;

import java.util.List;


public class EmployeeManagement implements IEmployeeManagement {


    @Override
    public void registerEmployee(Employee employee){

    }

    @Override
    public List<Employee> getAllEmployees(){
        return null;
    }

    @Override
    public void updateEmployee(int employeeID, Employee employee){

    }

    @Override
    public Employee showEmployeeByID(int employeeID){
        return null;
    }
}
