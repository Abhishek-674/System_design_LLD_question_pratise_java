package RentalStore;

public abstract class Vehicle {
    String number;
    VehicleType vehicleType;
    boolean isfree;
    public Vehicle(String number, VehicleType vehicleType) {
        this.number = number;
        this.vehicleType = vehicleType;
        this.isfree = true;
    }
    void bookVehicle(Vehicle vehicle)
    {
        vehicle.isfree=false;
    }
    void returnVehicle(Vehicle vehicle)
    {
        vehicle.isfree=true;
    }

}
