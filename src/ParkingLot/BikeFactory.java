package ParkingLot;

public class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle create(String number, VehicleType vehicleType) {
        return new Bike(number, vehicleType);
    }
}
