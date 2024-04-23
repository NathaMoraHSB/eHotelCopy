package com.example.application.Domain;

import com.example.application.Common.Customer;
import com.example.application.Common.Employee;
import com.example.application.Common.Manager;
import com.example.application.Common.User;
import com.example.application.Domain.Interfaces.IUserManagement;
import com.example.application.Persistence.IPersistence;
import com.example.application.Persistence.Persistence;
import com.vaadin.flow.server.VaadinSession;

import java.util.ArrayList;
import java.util.List;


public class UserManagement implements IUserManagement {


    private List<User> userList = new ArrayList<>();
    private IPersistence persistence;
    User user;

    public UserManagement() {

        persistence = new Persistence();

    }

    // Search for a user by username
    public User searchUserByUsername(String username) {
        for (User user : userList) {
            if (user.getUsername().trim().equalsIgnoreCase(username.trim())) {
                return user;
            }
        }
        return null;
    }


    public User login(String username, String password) {
        System.out.println("Attempting to log in with username: " + username);
        if (persistence.login(username, password)) {
            int userID = persistence.getUserID(username);
            User user;

            if (persistence.isManager(userID)) {

                System.out.println("Manager logged in: " + username);
                user =  new Manager(username, password, "Manager's Name", "Manager's Lastname", "Manager's Address", "Manager's WorkEmail");
            } else if (persistence.isEmployee(userID)) {

                System.out.println("Employee logged in: " + username);
                user = new Employee(username, password, "Employee's Name", "Employee's Lastname", "Employee's Address", "Employee's WorkEmail");
            } else {

                System.out.println("Customer logged in: " + username);
                user = new Customer(username, password, "Customer's Name", "Customer's Lastname", "Customer's Address", "email" );
            }

            // Benutzer in der VaadinSession speichern
            VaadinSession.getCurrent().setAttribute("user", user);
            return user;



        } else {
            System.out.println("Login failed for user: " + username);

            return null;
        }
    }



/*
    public List<Employee> getAllEmployees() {
        return persistence.getAllEmployees();
    }

    public List<Customer> getAllCustomers() {
        return persistence.getAllCustomers();
    }

*/


    // Register a new Customer
    public boolean registerCustomer(String username, String password, String name, String lastname, String address, String email, String paymentMethod) {
        if (searchUserByUsername(username) != null) {
            return false;
        }

        Customer newCustomer = new Customer(username, password, name, lastname, address, email);
        newCustomer.setEmail(email);
        newCustomer.setPaymentMethod(paymentMethod);

        userList.add(newCustomer); // function registercustomer (Customer customer )
        // to test
        System.out.println("List of all customers:");
        for (User user : userList) {
            if (user instanceof Customer) {
                Customer customer = (Customer) user;
                System.out.println("Username: " + customer.getUsername() + " password "+customer.getPassword()  + ", Email: " + customer.getEmail());
            }
        }
        return true;
    }

    @Override
    public void logout() {
        this.user=null;
    }

    @Override
    public int getUserID(String username){
        return 0;
    }

    public boolean updateUserDetails(String username, String newLastName, String newAddress, String newPassword) {
        User user = searchUserByUsername(username);
        if (user != null) {
            user.setLastname(newLastName);
            user.setAddress(newAddress);
            user.setPassword(newPassword); // Stellen Sie sicher, dass Passwörter sicher gespeichert werden (z.B. gehasht)

            // Angenommen, Ihre IPersistence-Schnittstelle hat eine Methode zum Aktualisieren von Benutzerdaten
            //return persistence.updateUser(user);
        }
        return false;
    }

}
