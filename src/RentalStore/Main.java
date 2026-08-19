package RentalStore;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        BookingManager  bookingManager = new BookingManager();
        Store s1=new Store("abc");
        Store s2=new Store("def");
        Vehicle v1=new Bike("123",VehicleType.BIKE);
        Vehicle v2=new Bike("456",VehicleType.BIKE);
        Vehicle v3=new Bike("789",VehicleType.BIKE);
        Vehicle c1=new Car("111",VehicleType.CAR);
        Vehicle c2=new Car("222",VehicleType.CAR);
        Vehicle c3=new Car("333",VehicleType.CAR);
        s1.addVehicle(v1);
        s1.addVehicle(v2);
        s1.addVehicle(c1);
        s2.addVehicle(v3);
        s2.addVehicle(c2);
        s2.addVehicle(c3);
        User u1=new User("Abhishek");
        Vehicle available=rentalSystem.getAvailableVehicleFromStore(s2);
        System.out.println("Available vehicle is "+available.number +" "+available.vehicleType);
        Bookings b1=bookingManager.makeBooking(u1,available, new Date(2002, 8, 9),
               new Date(2002, 8, 12),s2.name);
        Vehicle available1=rentalSystem.getAvailableVehicleFromStore(s2);
        System.out.println("Available vehicle is "+available1.number +" "+available1.vehicleType);
        Bookings b2=bookingManager.makeBooking(u1,available1, new Date(2002, 8, 9),
                new Date(2002, 8, 12),s2.name);

        bookingManager.returnVehicle(b1);
        b1=bookingManager.makeBooking(u1,available, new Date(2002, 8, 9),
                new Date(2002, 8, 12),s2.name);


    }
}
