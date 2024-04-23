package com.example.application.Persistence;

import com.example.application.Common.*;

import java.time.LocalDate;
import java.util.List;

public interface IPersistence {


 // eHotel-5. Login action
 // request
 boolean login(String username, String password);

 int getUserID (String username);

 boolean isEmployee(int userID);

 boolean isManager(int userID);

 boolean freeUsername(String username);

 // eHotel-5. Logout action
 // other
 void logout();

 public void newUser(User user);

 boolean freeEmail(String email);


 /** Customers**/
 void registerNewCustomer(Customer customer);

 Customer findCustomerByID(int customerID);

 List<Customer> getAllCustomers();

  // eHotel-4. Register a new customer
  // add

/**Employees**/

 List<Employee> getAllEmployees();

 // eHotel-36. Edit employee data
 // modify
 void updateEmployee(int employeeID, Employee employee);

 // eHotel-35. Show employee name by ID
 // request
 Employee showEmployeeByID(int employeeID);




 /**Rooms**/

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
 List<Room> showRoomNumbersAndStatuses(int ocupancy);

 // eHotel-66. Show the status of a room for a specific day
 // request
 int getRoomStatus(int roomId, LocalDate date);

 /**Booking**/

 List<Booking> allBookings();
 void roomAssignation( int roomID, int bookingID);

 // Additional methods based on the provided requirements...7
 // eHotel-25. Create a new booking
 // add
 void newBooking(int customerID, Booking booking);

 // eHotel-28. Show booking information
 // request
 Booking getBookingByID(int bookingId);

 //showBookingbyCustomer
 List<Booking> showBookingsByCustomer(int userID);

 // eHotel-30. Check booking status
 // request
 //todo this can be done by Domaiin?
 void changeBookingStatus(int bookingID);

 // eHotel-56. Add an actual check-in for a booking
 // add
 void addActualCheckIn(int bookingId, String checkInTime);

 // eHotel-57. There might be another requirement here, which is not listed.

 // eHotel-58. Add an actual check-out for a booking
 // add
 void addActualCheckOut(int bookingId, String checkOutTime);

 // eHotel-41. Show all requested bookings
 // request
 List<Booking> showRequestedBookings();

 // eHotel-38. Show all arrivals for today
 // request
 List<Booking> showArrivalsToday(String date);

 // eHotel-39. Show all departures for today
 // request
 /*SELECT * FROM Bookings WHERE startDate = '2024-04-21';
  */
 List<Booking> showDeparturesToday(String date);


/**LostAndFoundItems**/

// eHotel-71. Show a list of lost and found items
// request
List<LostItem> showAllLostItem();
 // eHotel-32. Record a new forgotten item
 // add

 // eHotel-33. Record a new forgotten item
 // eHotel-73. Add a new item to the lost and found
 // add
 void newLostItem(LostItem lostItem);
 void removeLostItem (int lostItemID);
 void updateLostItem(boolean status);

 // eHotel-74. Change the status of an item in the lost and found
 // modify
 void changeItemStatusInLostAndFound(int itemId, String newStatus);

 List<LostItem> showLostItemByCustomer(int customerID);

 // eHotel-42. Show lost and found items
 // request
 List<LostItem> showLostAndFoundItems();

 /**Bill**/

 // eHotel-62. Show billing information for a customer or booking
 // request

 void newBill(Bill bill);

//todo this calculation should be done in domain
 // eHotel-63. Calculate the price for meals included in a booking
 // request

 double calculateMealsPrice(int bookingId);

 // eHotel-64. Calculate the parking fee for a booking
 // request
 double calculateParkingFee(int bookingId);


 /**Logbook**/
 void newLogbookEntry (LogBook logBook);

  //todo What does it mean initiator in the Logbook context?? the user

 List<LogBook> showLogbookEntries();
 List<LogBook> showLogbookByUserID();

 List<LogBook> showLogbookByEvent();




 /**----------------------------------Draft--------------------------------------***/


 // eHotel-59 through eHotel-61 are not listed in the range provided.





//todo requirement 65 goes in logic or domain
// eHotel-65. Calculate the total price for a booking, including room, meals, and parking


 // eHotel-67 through eHotel-70 are not listed in the range provided.


 // eHotel-72. There might be another requirement here, which is not listed.


 }







