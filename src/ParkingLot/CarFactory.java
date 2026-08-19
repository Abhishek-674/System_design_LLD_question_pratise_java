package ParkingLot;

public class CarFactory implements VehicleFactory {
    @Override
    public  Vehicle create(String number, VehicleType vehicleType)
    {
        return new Car(number, vehicleType);
    }
}
