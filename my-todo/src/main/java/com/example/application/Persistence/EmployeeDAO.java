package com.example.application.Persistence;
import com.example.application.Common.Employee;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements IEmployeesP{

    private HikariDataSource dataSource = DbConnection.getDataSource();
    @Override
    public List<Employee> getAllEmployees() {
    List<Employee> employees = new ArrayList<>();

    try (Connection conn = dataSource.getConnection()) {
    String sql = "SELECT Users.userID, Users.UserName, Users.password, Users.name, Users.lastName, " +
    "Users.address, Employees.employeeID, Employees.workEmail " +
    "FROM Users JOIN Employees ON Users.userID = Employees.userID " +
    "WHERE Employees.isManager = 0";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
    try (ResultSet rs = pstmt.executeQuery()) {
    while (rs.next()) {
    // Crear un objeto Employee para cada fila de resultados y agregarlo a la lista
    Employee employee = new Employee(
    rs.getString("UserName"),
    rs.getString("password"),
    rs.getString("name"),
    rs.getString("lastName"),
    rs.getString("address"),
    rs.getString("workEmail")
    );
    employee.setEmployeeId(rs.getInt("employeeID"));
    employees.add(employee);
    }
    }
    }
    } catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
    }

    return employees;
    }

    @Override
    public void updateEmployee(int employeeID, Employee employee){

    }

    @Override
    public Employee showEmployeeByID(int employeeID){
        return null;
    }

    @Override
    public void registerEmployee(Employee employee){

    }
}
