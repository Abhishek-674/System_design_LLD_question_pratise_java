package RentalStore;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingManager {
    List<Bookings>  bookings;
    BookingManager() {
        this.bookings = new ArrayList<Bookings>();
    }
    Bookings makeBooking(User user, Vehicle vehicle,Date startDate, Date endDate,String storeName){

        Bookings newbooking= new Bookings.Builder().setUser(user).setEndDate(endDate).setStartDate(startDate).setStoreName(storeName).setVehicle(vehicle).build();
        newbooking.vehicle.bookVehicle(vehicle);
        bookings.add(newbooking);
        System.out.println("Booking has been made by "+user.name+" from store "+storeName+"for Vehicle "+vehicle.vehicleType+" "+vehicle.number);
        return newbooking;
    }
    void removeBooking(Bookings booking){
        bookings.remove(booking);
    }
    void returnVehicle(Bookings booking){
          booking.vehicle.returnVehicle(booking.vehicle);
          System.out.println("Vehicle "+booking.vehicle.number+" is returned");
          removeBooking(booking);
    }


}

