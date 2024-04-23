package com.example.application.Persistence;

import com.example.application.Common.Employee;

import java.util.List;

public interface IEmployeesP{
    List<Employee> getAllEmployees();

    // eHotel-36. Edit employee data
    // modify
    void updateEmployee(int employeeID, Employee employee);

    // eHotel-35. Show employee name by ID
    // request
    Employee showEmployeeByID(int employeeID);

    void registerEmployee(Employee employee);
}
