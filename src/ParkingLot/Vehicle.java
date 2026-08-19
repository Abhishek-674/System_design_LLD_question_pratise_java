package ParkingLot;

public abstract class Vehicle {
    String number;
    VehicleType vehicleType;
    public Vehicle(String number, VehicleType vehicleType) {
        this.number = number;
        this.vehicleType = vehicleType;
    }
    String getNumber()
    {
        return number;
    }
    String  getVehicleType()
    {
        return vehicleType.toString();
    }

//    public void bookVehicle() {
//    }
}
