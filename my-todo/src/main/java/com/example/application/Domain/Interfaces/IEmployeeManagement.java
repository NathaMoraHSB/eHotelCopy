package com.example.application.Domain.Interfaces;

import com.example.application.Common.Employee;

import java.util.List;

public interface IEmployeeManagement {

    // void updateEmployee(int employeeId, Employee employee);
    void registerEmployee(Employee employee);

    List<Employee> getAllEmployees();

    // eHotel-36. Edit employee data
    // modify
    void updateEmployee(int employeeID, Employee employee);

    // eHotel-35. Show employee name by ID
    // request
    Employee showEmployeeByID(int employeeID);



    /**
     eHotel-36. Edit employee data


   // void updateEmployee(int employeeId, Employee employee);


     // void updateEmployee(int employeeId, Employee employee);
     void registerEmployee(Employee employee);

     List<Employee> getAllEmployees();

     // eHotel-36. Edit employee data
     // modify
     void updateEmployee(int employeeID, Employee employee);

     // eHotel-35. Show employee name by ID
     // request
     Employee showEmployeeByID(int employeeID);





**/
}
