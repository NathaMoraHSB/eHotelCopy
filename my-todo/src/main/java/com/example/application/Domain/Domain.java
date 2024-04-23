package com.example.application.Domain;

import com.example.application.Common.*;
import com.example.application.Domain.Interfaces.*;

import java.time.LocalDate;
import java.util.List;

public class Domain implements IDomain {


    private IUserManagement userManagement;
    private ICustomerManagement customerManagement;
    private IBillingManagement billingManagement;
    private IBookingManagement bookingManagement;
    private ILostAndFoundManagement lostAndFoundManagement;
    private IEmployeeManagement employeeManagement;
    private ILogBookManagement logBookManagement;
    private IRoomManagement roomManagement;

    public Domain() {

        userManagement = new UserManagement();
        customerManagement= new CustomerManagement();
        billingManagement=new BillingManagement();
        bookingManagement=  new BookingManagement();
        lostAndFoundManagement= new LostandFoundManagement();
        employeeManagement = new EmployeeManagement();
        logBookManagement = new LogbookManagement();
        roomManagement = new RoomManagement();
    }


    @Override
    public User login(String username, String password) {

        return userManagement.login(username,password);
    }

    @Override
    public int getUserID(String username){
        return userManagement.getUserID(username);
    }

    //todo check if this need to be delete since is used only for the login
    // but it is a method offered by persistence
    @Override
    public boolean isEmployee(int userID){
        return false;
    }

    @Override
    public boolean isManager(int userID){
        return false;
    }

    @Override
    public User searchUserByUsername(String username){
        return userManagement.searchUserByUsername(username);
    }
    //todo check if that is needed in the presentation but is is also offered in persistance
    @Override
    public void newUser(User user){

    }

    @Override
    public void logout(){
        userManagement.logout();
    }

    /**
     * -----Customer-----
     *
     * @param userID
     */
    @Override
    public Customer findCustomerById(int userID){
        return customerManagement.findCustomerById(userID);
    }

    @Override
    public boolean freeUsername(String username){
        return customerManagement.freeUsername(username);
    }

    @Override
    public boolean freeEmail(String email){
        return customerManagement.freeEmail(email);
    }

    @Override
    public void registerNewCustomer(Customer customer){
        customerManagement.registerNewCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomers(){
        return customerManagement.getAllCustomers();
    }

    /**
     * -----Employee-----
     *
     * @param employee
     */
    @Override
    public void registerEmployee(Employee employee){
        employeeManagement.registerEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeManagement.getAllEmployees();
    }

    @Override
    public void updateEmployee(int employeeID, Employee employee){

    }

    @Override
    public Employee showEmployeeByID(int employeeID){
        return employeeManagement.showEmployeeByID(employeeID);
    }

    /**
     * -----Bill-----
     *
     * @param bill
     */
    @Override
    public void newBill(Bill bill){
        billingManagement.newBill(bill);
    }

    @Override
    public Bill getBillByID(int bookingID){
        return billingManagement.getBillByID(bookingID);
    }

    @Override
    public float calculateParking(){
        return billingManagement.calculateParking();
    }

    @Override
    public float calculateMeals(){
        return billingManagement.calculateMeals();
    }

    @Override
    public float totalPrice(){
        return billingManagement.totalPrice();
    }

    /**
     * -----Booking-----
     */
    @Override
    public List<Booking> allBookings(){
        return bookingManagement.allBookings();
    }

    @Override
    public void addActualCheckIn(int bookingId, String checkInTime){
    bookingManagement.addActualCheckIn(bookingId, checkInTime);
    }

    @Override
    public void addActualCheckOut(int bookingId, String checkOutTime){
    bookingManagement.addActualCheckOut(bookingId,checkOutTime);
    }

    @Override
    public void bookingValidation(){
        bookingManagement.bookinValidation();
    }

    @Override
    public void changeBookingStatus(int bookingIDg){
        bookingManagement.changeBookingStatus(bookingIDg);
    }

    @Override
    public Booking getBookingByID(int bookingId){
        return bookingManagement.getBookingByID(bookingId);
    }

    @Override
    public void newBooking(int customerID, Booking booking){
        bookingManagement.newBooking(customerID, booking);
    }

    @Override
    public void roomAssignation(int roomID, int bookingID){
        bookingManagement.roomAssignation(roomID, bookingID);

    }

    @Override
    public List<Booking> showArrivalsToday(String date){
        return bookingManagement.showArrivalsToday(date);
    }

    @Override
    public List<Booking> showBookingsByCustomer(int userID){
        return bookingManagement.showBookingbyCustomer(userID);
    }

    @Override
    public List<Booking> showDeparturesToday(String date){
        return bookingManagement.showDeparturesToday(date);
    }

    @Override
    public List<Booking> showRequestedBookings(){
        return bookingManagement.showRequestedBookings();
    }

    /**
     * -----Lost and Found----
     *
     * @param lostItem
     */
    @Override
    public void newLostItem(LostItem lostItem){
        lostAndFoundManagement.newLostItem(lostItem);
    }

    @Override
    public void removeLostItem(int lostItemID){
        lostAndFoundManagement.removeLostItem(lostItemID);
    }

    @Override
    public void updateLostItem(boolean status){
        lostAndFoundManagement.updateLostItem(status);
    }

    @Override
    public void filterLostStatus(){
        lostAndFoundManagement.filterLostStatus();
    }

    @Override
    public void sortLostByStatus(){
        lostAndFoundManagement.showAllLostItem();
    }

    @Override
    public List<LostItem> showAllLostItem(){
        return lostAndFoundManagement.showAllLostItem();
    }

    @Override
    public List<LostItem> showLostItemByCustomer(int customerId){
        return lostAndFoundManagement.showLostItemByCustomer(customerId);
    }

    /**
     * -----LogBook-----
     */
    @Override
    public List<LogBook> showLogbookEntries(){
        return logBookManagement.showLogbookEntries();
    }

    @Override
    public List<LogBook> showLogbookByUserID(){
        return logBookManagement.showLogbookByUserID();
    }

    @Override
    public List<LogBook> showLogbookByEvent(){
        return logBookManagement.showLogbookByEvent();
    }

    @Override
    public void logLoginFailed(String initiator){
        logBookManagement.logLoginFailed(initiator);
    }

    @Override
    public void logCustomerReRegistered(String initiator){
        logBookManagement.logCustomerReRegistered(initiator);
    }

    @Override
    public void logRoomDeleted(String initiator){
        logBookManagement.logRoomDeleted(initiator);
    }

    @Override
    public void logCheckIn(String initiator){
        logBookManagement.logCheckIn(initiator);
    }

    @Override
    public void logCheckout(String initiator){
        logBookManagement.logCheckout(initiator);
    }

    @Override
    public void printLogs(int lines){
        logBookManagement.printLogs(lines);
    }

    @Override
    public void sortLogsByDate(){
        logBookManagement.sortLogsByDate();
    }

    @Override
    public void sortLogsByCause(){
        logBookManagement.sortLogsByCause();
    }

    @Override
    public void sortLogsByEvent(){
        logBookManagement.sortLogsByEvent();
    }

    /**
     * Rooms
     **/
    @Override
    public List<Room> filterNonSmoking(){
        return roomManagement.filterNonSmoking();
    }

    @Override
    public List<Room> filterlocation(){
        return roomManagement.filterlocation();
    }

    @Override
    public List<Room> filterSeaView(){
        return roomManagement.filterSeaView();
    }

    @Override
    public List<Room> filterFloor(int floor){
        return roomManagement.filterFloor(floor);
    }

    @Override
    public List<Room> showRoomTypePrice(String roomType){
        return roomManagement.showRoomTypePrice(roomType);
    }

    @Override
    public List<Room> showAllRooms(){
        return roomManagement.showAllRooms();
    }

    @Override
    public List<Room> roomInfoByCustomer(int bookingID){
        return roomManagement.roomInfoByCustomer(bookingID);
    }

    @Override
    public List<Room> showRoomNumbersAndStatuses(int occupancy){
        return roomManagement.showRoomNumbersAndStatuses(occupancy);
    }

    @Override
    public int getRoomStatus(int roomId, LocalDate date){
        return roomManagement.getRoomStatus(roomId,date);
    }

   @Override
   public boolean registerCustomer(String username, String password, String name, String lastname, String address, String email, String paymentMethod) {
        return userManagement.registerCustomer(username, password,name, lastname,  address,email, paymentMethod);
    }




}
