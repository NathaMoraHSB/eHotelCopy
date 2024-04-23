package com.example.application.Domain.Interfaces;

import com.example.application.Common.*;

import java.time.LocalDate;
import java.util.List;

 public interface IDomain{

    /**
     * -----User-----
     */
    User login(String username, String password);

    int getUserID(String username);

    boolean isEmployee(int userID);

    boolean isManager(int userID);

    User searchUserByUsername(String username);

    public void newUser(User user);

    void logout();

    /**
     * -----Customer-----
     */
    Customer findCustomerById(int userID);

    boolean freeUsername(String username);

    boolean freeEmail(String email);

    void registerNewCustomer(Customer customer);

    //TODO the method in persistence receive a customer like the one in line 36
    boolean registerCustomer(String username, String password, String name, String lastname, String address, String email, String paymentMethod);

    List<Customer> getAllCustomers();


    /**
     * -----Employee-----
     */
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
     * -----Bill-----
     */
    void newBill(Bill bill);

    Bill getBillByID(int bookingID);

    // eHotel - 63
    float calculateParking();

    // eHotel - 64
    float calculateMeals();

    float totalPrice();

    /**
     * -----Booking-----
     */
    List<Booking> allBookings();

    void addActualCheckIn(int bookingId, String checkInTime);

    void addActualCheckOut(int bookingId, String checkOutTime);

    void bookingValidation(); // Domain



    void changeBookingStatus(int bookingID);

    Booking getBookingByID(int bookingId);

    void newBooking(int customerID, Booking booking);

    void roomAssignation(int roomID, int bookingID);

    List<Booking> showArrivalsToday(String date);

    List<Booking> showBookingsByCustomer(int userID);

    List<Booking> showDeparturesToday(String date);

    List<Booking> showRequestedBookings();


    /**
     * -----Lost and Found----
     */
    //eHotel-32

    void newLostItem(LostItem lostItem); // Both of Customer and Employee can create it

    void removeLostItem(int lostItemID);

    void updateLostItem(boolean status);

    void filterLostStatus();

    void sortLostByStatus();

    List<LostItem> showAllLostItem();

    List<LostItem> showLostItemByCustomer(int customerId);


    /**
     * -----LogBook-----
     */
    List<LogBook> showLogbookEntries();

    List<LogBook> showLogbookByUserID();

    List<LogBook> showLogbookByEvent();

    void logLoginFailed(String initiator);

    void logCustomerReRegistered(String initiator);

    void logRoomDeleted(String initiator);

    void logCheckIn(String initiator);

    void logCheckout(String initiator);

    void printLogs(int lines);

    void sortLogsByDate();

    void sortLogsByCause();

    void sortLogsByEvent();

    /**
     * Rooms
     **/
    List<Room> filterNonSmoking();

    List<Room> filterlocation();

    List<Room> filterSeaView();

    List<Room> filterFloor(int floor);

//eHotel-8. Show available rooms for the general view
//type, price and picture
// request

    // eHotel-9. Show room type with price and image
// request
    List<Room> showRoomTypePrice(String roomType);

    List<Room> showAllRooms();

    // eHotel-14. Provide information about a room for a customer
    // request
    List<Room> roomInfoByCustomer(int bookingID);

    // eHotel-40. Show room numbers and their statuses
    // request
    List<Room> showRoomNumbersAndStatuses(int occupancy);

    // eHotel-66. Show the status of a room for a specific day
    // request
    int getRoomStatus(int roomId, LocalDate date);

}
