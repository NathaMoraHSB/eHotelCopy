package com.example.application.Persistence;

import com.example.application.Common.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class Persistence implements IPersistence{

    private IUserP userDAO;
    private ICustomerP customerDAO;
    private IEmployeesP employeeDAO;
    private IRoomP roomDAO;
    private IBookingP bookingDAO;
    private IBillingP billingDAO;
    private ILostAndFoundP lostAndFoundDAO;
    private ILogbookP logbookDAO;


    public Persistence(){
        this.userDAO=new UserDAO();
        this.customerDAO=new CustomerDAO();
        this.employeeDAO=new EmployeeDAO();
        this.roomDAO=new RoomDAO();
        this.bookingDAO=new BookingDAO();
        this.lostAndFoundDAO=new LostAndFoundDAO();
        this.billingDAO=new BillingDAO();

    }

    @Override
    public boolean login(String username, String password){
        return userDAO.login(username, password);
    }

    @Override
    public int getUserID(String username){
        int userID=0; // Default value in case of errors or if the username is not found

        return userDAO.getUserID(username);
    }

    @Override
    public boolean isEmployee(int userID){
        return userDAO.isEmployee(userID);
    }

    @Override
    public boolean isManager(int userID){

        return userDAO.isManager(userID);
    }

    @Override
    public boolean freeUsername(String username){
        return false;
    }

    @Override
    public void logout(){

    }

    @Override
    public void newUser(User user){

    }

    @Override
    public boolean freeEmail(String email){
        return false;
    }

    /**
     * Customers
     *
     * @param customer
     **/
    @Override
    public void registerNewCustomer(Customer customer){
        customerDAO.registerNewCustomer(customer);

    }

    @Override
    public Customer findCustomerByID(int customerID){
        return customerDAO.findCustomerByID(customerID);
    }

    @Override
    public List<Customer> getAllCustomers(){
        return customerDAO.getAllCustomers();
    }

    /**
     * Employees
     **/
    @Override
    public List<Employee> getAllEmployees(){
        return employeeDAO.getAllEmployees();
    }

    @Override
    public void updateEmployee(int employeeID, Employee employee){
        employeeDAO.updateEmployee(employeeID, employee);
    }

    @Override
    public Employee showEmployeeByID(int employeeID){
        return employeeDAO.showEmployeeByID(employeeID);
    }

    /**
     * Rooms
     *
     * @param roomType
     **/
    @Override
    public List<Room> showRoomTypePrice(String roomType){
        return roomDAO.showRoomTypePrice(roomType);
    }

    @Override
    public List<Room> showAllRooms(){
        return roomDAO.showAllRooms();
    }

    @Override
    public List<Room> roomInfoByCustomer(int bookingID){
        return roomDAO.roomInfoByCustomer(bookingID);
    }

    @Override
    public List<Room> showRoomNumbersAndStatuses(int occupancy){
        return roomDAO.showRoomNumbersAndStatuses(occupancy);
    }

    @Override
    public int getRoomStatus(int roomId, LocalDate date){
        return roomDAO.getRoomStatus(roomId, date);
    }

    /**
     * Booking
     **/
    @Override
    public List<Booking> allBookings(){
        return bookingDAO.allBookings();
    }

    @Override
    public void roomAssignation(int roomID, int bookingID){
        bookingDAO.roomAssignation(roomID, bookingID);
    }

    @Override
    public void newBooking(int customerID, Booking booking){
        bookingDAO.newBooking(customerID, booking);
    }

    @Override
    public Booking getBookingByID(int bookingId){
        return bookingDAO.getBookingByID(bookingId);
    }

    @Override
    public List<Booking> showBookingsByCustomer(int userID){
        return bookingDAO.showBookingsByCustomer(userID);
    }

    @Override
    public void changeBookingStatus(int bookingID){
        bookingDAO.changeBookingStatus(bookingID);
    }

    @Override
    public void addActualCheckIn(int bookingId, String checkInTime){
        bookingDAO.addActualCheckIn(bookingId, checkInTime);
    }

    @Override
    public void addActualCheckOut(int bookingId, String checkOutTime){
        bookingDAO.addActualCheckOut(bookingId, checkOutTime);
    }

    @Override
    public List<Booking> showRequestedBookings(){
        return bookingDAO.showRequestedBookings();
    }

    @Override
    public List<Booking> showArrivalsToday(String date){
        return bookingDAO.showArrivalsToday(date);
    }

    @Override
    public List<Booking> showDeparturesToday(String date){
        return bookingDAO.showDeparturesToday(date);
    }

    /**
     * LostAndFoundItems
     **/
    @Override
    public List<LostItem> showAllLostItem(){
        return lostAndFoundDAO.showAllLostItem();
    }

    @Override
    public void newLostItem(LostItem lostItem){
        lostAndFoundDAO.newLostItem(lostItem);
    }

    @Override
    public void removeLostItem(int lostItemID){
        lostAndFoundDAO.removeLostItem(lostItemID);
    }

    @Override
    public void updateLostItem(boolean status){
        lostAndFoundDAO.updateLostItem(status);
    }

    @Override
    public void changeItemStatusInLostAndFound(int itemId, String newStatus){
        lostAndFoundDAO.changeItemStatusInLostAndFound(itemId, newStatus);
    }

    @Override
    public List<LostItem> showLostItemByCustomer(int customerID){
        return lostAndFoundDAO.showLostItemByCustomer(customerID);
    }

    @Override
    public List<LostItem> showLostAndFoundItems(){
        return lostAndFoundDAO.showLostAndFoundItems();
    }

    /**
     * Bill
     **/
    @Override
    public void newBill(Bill bill){
        billingDAO.newBill(bill);
    }

    @Override
    public double calculateMealsPrice(int bookingId){
        return 0;
    }

    @Override
    public double calculateParkingFee(int bookingId){
        return 0;
    }

    /**
     * Logbook
     *
     * @param logBook
     **/
    @Override
    public void newLogbookEntry(LogBook logBook){
        logbookDAO.newLogbookEntry(logBook);
    }

    @Override
    public List<LogBook> showLogbookEntries(){
        return logbookDAO.showLogbookEntries();
    }

    @Override
    public List<LogBook> showLogbookByUserID(){
        return logbookDAO.showLogbookByUserID();
    }

    @Override
    public List<LogBook> showLogbookByEvent(){
        return logbookDAO.showLogbookByEvent();
    }
}