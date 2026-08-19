package UberSystem;

public class Ride {
      Location from;
      Location to;
      VehicleType vehicleType;
      Rider rider;
      Driver driver;
      public Ride(Location from, Location to, VehicleType vehicleType, Rider rider, Driver driver)
      {
          this.from = from;
          this.to = to;
          this.vehicleType = vehicleType;
          this.rider = rider;
          this.driver = driver;
      }
}
