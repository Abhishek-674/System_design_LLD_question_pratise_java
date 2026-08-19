package RentalStore;

public class VehicleFactory {
    public static Vehicle createVehicle(String number, VehicleType vehicleType)
    {
        if(vehicleType.equals(VehicleType.CAR))
        {
            return new Car(number, vehicleType);
        }
        else if(vehicleType.equals(VehicleType.BIKE))
        {
            return new Bike(number, vehicleType);
        }
        else return null;
    }
}
